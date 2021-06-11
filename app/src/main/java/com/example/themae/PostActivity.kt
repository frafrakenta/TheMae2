package com.example.themae

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat

import java.time.LocalDateTime
import java.util.*

class PostActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)
        var btnPost : Button = findViewById(R.id.btnPost)
        var title : TextView = findViewById(R.id.editTextTitle)
        var content : TextView = findViewById(R.id.editTextContent)
        var uname : TextView = findViewById(R.id.PostUserName)
        var cadb = CurrentUserDatabase.getInstance(this)
        var currentuserDao = cadb.currentuserDao()
        var currentuserList = currentuserDao.getAll()
        uname.text = currentuserList[0].accountName

        fun getToday(): String {
            val date = Date()
            val format = SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", Locale.getDefault())
            return format.format(date)
        }

        var localDateTime = getToday()
        val database = UserDatabase.getInstance(this)
        val userDao = database.userDao()
        btnPost.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                val newUser = User(0, title.text.toString(), content.text.toString(), uname.text.toString(), localDateTime.toString(), 0)
                userDao.insert(newUser)
                val intent = Intent(this@PostActivity, ViewActivity::class.java)
                startActivity(intent)
            }
        })
    }
}