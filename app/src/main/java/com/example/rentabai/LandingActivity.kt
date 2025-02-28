package com.example.rentabai

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class LandingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)


        val imageAccount: ImageView = findViewById(R.id.account_button)

        val settingsButton: Button = findViewById(R.id.settingsButton)
        val logoutButton: Button = findViewById(R.id.logoutButton)

        settingsButton.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

        logoutButton.setOnClickListener {
            val intent = Intent(this, LogoutActivity::class.java)
            startActivity(intent)
        }

        imageAccount.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }


}
