package com.example.themae

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class ViewActivity : AppCompatActivity() {
    lateinit var mUserDao: UserDao
    private var mUserList: List<User> = listOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        mUserDao = UserDatabase.getInstance(this).userDao()

        mUserList = mUserDao.getAll()
        val UserList: ArrayList<User> = ArrayList(mUserList)
        var list_view = findViewById<ListView>(R.id.list_view)

        val Adapter = ListAdapter(this, UserList)
        list_view.adapter = Adapter

        var btnPost : Button = findViewById(R.id.postPost)
        btnPost.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {

                val intent = Intent(this@ViewActivity, PostActivity::class.java)
                startActivity(intent)
            }
        })
        var btnSearch : Button = findViewById(R.id.postSearch)
        btnSearch.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {

                val intent = Intent(this@ViewActivity, SearchActivity::class.java)
                startActivity(intent)
            }
        })
        var btnHome : Button = findViewById(R.id.btnViewHome)
        btnHome.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@ViewActivity, MainMenu::class.java)
                startActivity(intent)
            }
        })
    }
}