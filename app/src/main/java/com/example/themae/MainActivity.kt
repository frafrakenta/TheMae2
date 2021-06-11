package com.example.themae

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var btnStart : Button = findViewById(R.id.start_button)
        var btnAccount : Button = findViewById(R.id.btnNewAccount)
        var db = AccountDatabase.getInstance(this)
        var accountDao = db.accountDao()

        var cadb = CurrentUserDatabase.getInstance(this)
        var currentuserDao = cadb.currentuserDao()


        btnStart.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                var uid : TextView = findViewById(R.id.editTextUserid)
                var id : String = uid.getText().toString()
                var id2 : Int = id.toInt()

                var pass : TextView = findViewById(R.id.editTextPassword)
                var pass2 : String = pass.getText().toString()

                var accountList = accountDao.getAccountdata(id2)

                if(accountList.isEmpty()){
                    Toast.makeText(applicationContext, "The id not exist", Toast.LENGTH_LONG).show()
                }
                else if(accountList[0].accountPassword == pass2){

                    val updatecurrentuser = CurrentUser(1,accountList[0].accountName)
                    currentuserDao.deletecurrentdata(1)
                    currentuserDao.insert(updatecurrentuser)
                    Toast.makeText(applicationContext, "Login Success", Toast.LENGTH_LONG).show()
                    val intent = Intent(this@MainActivity, MainMenu::class.java)
                    startActivity(intent)
                }
                else{
                    Toast.makeText(applicationContext, "Login Failed", Toast.LENGTH_LONG).show()
                }

            }
        })
        btnAccount.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, CreateActivity::class.java)
                startActivity(intent)
            }
        })

    }
}