package com.easywash.application

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EditProfileActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        val name = findViewById<EditText>(R.id.edittext_fullname)
        val phone = findViewById<EditText>(R.id.edittext_phonenumber)
        val button_profilesave = findViewById<Button>(R.id.button_profilesave)
        button_profilesave.setOnClickListener {
            Log.e("Edit Profile", "Saved Successfully")

            Toast.makeText(this, "Saved Successfully", Toast.LENGTH_LONG).show()

            val intent = Intent(this, ProfileActivity::class.java).apply {
                putExtra("Name", name.text.toString())
                putExtra("Phone", phone.text.toString())
            }
            startActivity(intent)
        }

        val button_profilecancel = findViewById<Button>(R.id.button_profilecancel)
        button_profilecancel.setOnClickListener {
            Log.e("Edit Profile", "Edit Cancelled")

            Toast.makeText(this, "Edit Cancelled", Toast.LENGTH_LONG).show()

            val intent1 = Intent(this, ProfileActivity::class.java)
            startActivity(intent1)
        }
    }
}