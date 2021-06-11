package com.example.themae

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*


class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.themae.R.layout.activity_search)

        var title : TextView = findViewById(R.id.searchTitle)
        var uname : TextView = findViewById(R.id.searchName)
        var time : TextView = findViewById(R.id.searchDatetime)
        var content : TextView = findViewById(R.id.searchContent)
        var liked : TextView = findViewById(R.id.searchLiked)


        var db = UserDatabase.getInstance(this)
        var userDao = db.userDao()

        var cadb = CurrentUserDatabase.getInstance(this)
        var currentuserDao = cadb.currentuserDao()
        var currentuserList = currentuserDao.getAll()


        var btnSearch : Button = findViewById(R.id.searchSearch)
        btnSearch.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                var uid : EditText = findViewById(R.id.searchID)
                var numm : String = uid.getText().toString()
                var num : Int = numm.toInt()
                var userList = userDao.getdata(num)
                title.text = userList[0].title
                uname.text = userList[0].username
                title.text = userList[0].title
                time.text = userList[0].datetime
                content.text = userList[0].content
                liked.text = userList[0].like.toString()
            }
        })
        var btnDelete : Button = findViewById(R.id.btnDelete)
        btnDelete.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                var uid : EditText = findViewById(R.id.searchID)
                var numm : String = uid.getText().toString()
                var num : Int = numm.toInt()

                if(currentuserList[0].accountName == uname.text){
                    userDao.deletedata(num)
                    val intent = Intent(this@SearchActivity, ViewActivity::class.java)
                    startActivity(intent)
                }
                else{
                    Toast.makeText(applicationContext, "You cannot delete this post", Toast.LENGTH_LONG).show()
                }

            }
        })

        var btnUpdate : Button = findViewById(R.id.btnUpdate)
        btnUpdate.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                var uid : EditText = findViewById(R.id.searchID)
                var numm : String = uid.getText().toString()
                var num : Int = numm.toInt()
                var localDateTime = getToday()

                if(currentuserList[0].accountName == uname.text){
                    userDao.deletedata(num)
                    val newUser = User(num, title.text.toString(), content.text.toString(), uname.text.toString(), localDateTime.toString(), liked.text.toString().toInt())
                    userDao.insert(newUser)
                    val intent = Intent(this@SearchActivity, ViewActivity::class.java)
                    startActivity(intent)
                }
                else{
                    Toast.makeText(applicationContext, "You cannot update this post", Toast.LENGTH_LONG).show()
                }
            }
        })

        var btnLike : Button = findViewById(R.id.btnLike)
        btnLike.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                var uid : EditText = findViewById(R.id.searchID)
                var numm : String = uid.getText().toString()
                var num : Int = numm.toInt()
                var localDateTime = getToday()

                var like = liked.text.toString().toInt()
                like = likenum(like)

                liked.text = like.toString()
                userDao.deletedata(num)
                val newUser = User(num, title.text.toString(), content.text.toString(), uname.text.toString(), localDateTime.toString(), liked.text.toString().toInt())
                userDao.insert(newUser)
                Toast.makeText(applicationContext, "Liked this Post!!", Toast.LENGTH_LONG).show()
                val intent = Intent(this@SearchActivity, ViewLikeActivity::class.java)
                startActivity(intent)
            }
        })
        var btnHome : Button = findViewById(R.id.btnSearchHome)
        btnHome.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@SearchActivity, MainMenu::class.java)
                startActivity(intent)
            }
        })



    }
    fun getToday(): String {
        val date = Date()
        val format = SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", Locale.getDefault())
        return format.format(date)
    }
    fun likenum(v1:Int): Int{
        var numlike = v1 + 1
        return numlike
    }


}