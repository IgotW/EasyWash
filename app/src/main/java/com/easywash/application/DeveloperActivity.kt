package com.easywash.application

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.Toast

class DeveloperActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_developer)

        val imgbutton_devback = findViewById<ImageView>(R.id.imgbutton_devback)
        imgbutton_devback.setOnClickListener {
            Log.e("Developers Page", "Back to Settings")

            Toast.makeText(this, "Back to Settings", Toast.LENGTH_LONG).show()

            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}