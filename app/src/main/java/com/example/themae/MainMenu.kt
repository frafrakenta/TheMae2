package com.example.themae

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        var btnPost : Button = findViewById(R.id.btnMenuPost)
        var btnSearch : Button = findViewById(R.id.btnMenuSearch)
        var btnView : Button = findViewById(R.id.btnMenuView)
        var btnLike : Button = findViewById(R.id.btnMenuLike)

        btnPost.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@MainMenu, PostActivity::class.java)
                startActivity(intent)
            }
        })
        btnSearch.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@MainMenu, SearchActivity::class.java)
                startActivity(intent)
            }
        })
        btnView.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@MainMenu, ViewActivity::class.java)
                startActivity(intent)
            }
        })
        btnLike.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@MainMenu, ViewLikeActivity::class.java)
                startActivity(intent)
            }
        })

    }
}