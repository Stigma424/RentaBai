package com.example.rentabai

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)

        val usernameEditText = findViewById<EditText>(R.id.UsernameTextBox)
        val passwordEditText = findViewById<EditText>(R.id.PasswordTextBox)
        val loginButton = findViewById<Button>(R.id.LogInButton)

        loginButton.setOnClickListener {
            val intent = Intent(this, LandingPageActivity::class.java)
            startActivity(intent)
        }
    }
    //Method for Checking Username and Password Validation
    private fun isValid(inputUsername: String, inputPassword: String,username:String,password:String): Boolean {
        return (inputUsername == username && password == inputPassword);
    }
}