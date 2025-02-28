package com.example.rentabai

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button


class LoginActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<Button>(R.id.button_login)

        loginButton.setOnClickListener {
            Log.e("login button", "Button clicked")

            val intent = Intent(this,LandingActivity::class.java)
            startActivity(intent)
        }


    }
}