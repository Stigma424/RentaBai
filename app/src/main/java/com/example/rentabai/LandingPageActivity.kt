package com.example.rentabai

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LandingPageActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landing_page)

        val logoutButton = findViewById<Button>(R.id.LogoutButton)
        val settingsButton = findViewById<Button>(R.id.SettingsButton)
        val profileButton = findViewById<Button>(R.id.ProfileButton)

        logoutButton.setOnClickListener{
            val intent = Intent(this,LogoutActivity::class.java)
            startActivity(intent)
        }
        settingsButton.setOnClickListener{
            val intent = Intent(this,SettingsActivity::class.java)
            startActivity(intent)
        }
        profileButton.setOnClickListener{
            val intent = Intent(this,ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}