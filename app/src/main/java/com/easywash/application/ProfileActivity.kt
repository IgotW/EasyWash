package com.easywash.application

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class ProfileActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val imgbutton_backprofile = findViewById<ImageView>(R.id.imgbutton_backprofile)
        imgbutton_backprofile.setOnClickListener {
            Log.e("Profile", "Back to Landing Page")

            Toast.makeText(this, "Back to Landing Page", Toast.LENGTH_LONG).show()

            val intent = Intent(this, LandingPageActivity::class.java)
            startActivity(intent)
        }

        val button_logout = findViewById<Button>(R.id.button_logout)
        button_logout.setOnClickListener {
            Log.e("Profile", "Logout is clicked!")

            Toast.makeText(this, "Logout is clicked", Toast.LENGTH_LONG).show()

            val intent1 = Intent(this, LogoutActivity::class.java)
            startActivity(intent1)
        }
    }
}