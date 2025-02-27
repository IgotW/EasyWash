package com.easywash.application

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class SettingsActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val imgbutton_backsettings = findViewById<ImageView>(R.id.imgbutton_backsettings)
        imgbutton_backsettings.setOnClickListener {
            Log.e("Settings", "Back to Landing Page")

            Toast.makeText(this, "Back to Landing Page", Toast.LENGTH_LONG).show()

            val intent = Intent(this, LandingPageActivity::class.java)
            startActivity(intent)
        }

        val imgbutton_developer = findViewById<ImageButton>(R.id.imgbutton_developer)
        imgbutton_developer.setOnClickListener {
            Log.e("Settings", "Proceeds to Developers Page")

            Toast.makeText(this, "Proceeds to Developers Page", Toast.LENGTH_LONG).show()

            val intent1 = Intent(this, DeveloperActivity::class.java)
            startActivity(intent1)
        }

        val textview_developer = findViewById<TextView>(R.id.textview_developer)
        textview_developer.setOnClickListener {
            Log.e("Settings", "Proceeds to Developers Page")

            Toast.makeText(this, "Proceeds to Developers Page", Toast.LENGTH_LONG).show()

            val intent2 = Intent(this, DeveloperActivity::class.java)
            startActivity(intent2)
        }
    }
}