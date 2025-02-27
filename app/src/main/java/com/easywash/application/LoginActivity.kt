package com.easywash.application

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val defaultUsername = "sobranglatino"
        val defaultPassword = "12345"
        val edittext_username = findViewById<EditText>(R.id.edittext_username)
        val edittext_password = findViewById<EditText>(R.id.edittext_password)

        val button_login = findViewById<Button>(R.id.button_login)
        button_login.setOnClickListener {
            val username = edittext_username.text.toString().trim()
            val password = edittext_password.text.toString().trim()

            if(username.isNullOrEmpty() || password.isNullOrEmpty()){
                Toast.makeText(this, "Username or Password cannot be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }else if(username != defaultUsername || password != defaultPassword){
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            Log.e("Login","Login Successfully!")

            Toast.makeText(this, "Login Successfully!", Toast.LENGTH_LONG).show()

            val intent = Intent(this, LandingPageActivity::class.java)
            startActivity(intent)
        }
    }
}