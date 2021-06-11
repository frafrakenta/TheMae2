package com.example.themae

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class CreateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)
        var btnregister: Button = findViewById(R.id.btnRegister)
        var db = AccountDatabase.getInstance(this)
        var accountDao = db.accountDao()
        btnregister.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                var uid : TextView = findViewById(R.id.NewID)
                var id : String = uid.getText().toString()
                var id2 : Int = id.toInt()
                var name : TextView = findViewById(R.id.NewName)
                var pass : TextView = findViewById(R.id.NewPassword)
                var accountList = accountDao.getAccountdata(id2)

                if(accountList.isEmpty()){
                    val newAccount = Account(id2, name.text.toString(), pass.text.toString())
                    accountDao.insert(newAccount)
                    Toast.makeText(applicationContext, "Registered!", Toast.LENGTH_LONG).show()
                    val intent = Intent(this@CreateActivity, MainActivity::class.java)
                    startActivity(intent)
                }
                else{
                    Toast.makeText(applicationContext, "Change ID", Toast.LENGTH_LONG).show()
                }


            }
        })
    }
}