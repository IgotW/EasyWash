package com.easywash.application

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast

class LandingPageActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)

        val imgbutton_profile = findViewById<ImageView>(R.id.imgbutton_profile)
        imgbutton_profile.setOnClickListener {
            Log.e("Landing Page", "Profile is clicked!")

            Toast.makeText(this,"Profile is clicked!", Toast.LENGTH_LONG).show()

            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        val imgbutton_settings = findViewById<ImageView>(R.id.imgbutton_settings)
        imgbutton_settings.setOnClickListener {
            Log.e("Landing Page", "Settings is clicked!")

            Toast.makeText(this, "Settings is clicked!", Toast.LENGTH_LONG).show()

            val intent1 = Intent(this, SettingsActivity::class.java)
            startActivity(intent1)
        }
    }
}