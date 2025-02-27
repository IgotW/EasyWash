package com.easywash.application

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class LogoutActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logout)

        val button_confirmlogout = findViewById<Button>(R.id.button_confirmlogout)
        button_confirmlogout.setOnClickListener {
            Log.e("Logout Page", "Logout successfully!")

            Toast.makeText(this, "Logout successfully!", Toast.LENGTH_LONG).show()

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        val button_cancel = findViewById<Button>(R.id.button_cancel)
        button_cancel.setOnClickListener {
            Log.e("Logout Page", "Logout cancelled")

            Toast.makeText(this, "Logout cancelled", Toast.LENGTH_LONG).show()

            val intent1 = Intent(this, ProfileActivity::class.java)
            startActivity(intent1)
        }
    }
}