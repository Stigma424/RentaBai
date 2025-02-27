package com.example.rentabai

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DeveloperActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.developer_page)

        var devNumber = 1;
        val backButton = findViewById<Button>(R.id.BackButton)
        val shiftButton = findViewById<Button>(R.id.ShiftButton)
        val devPfp = findViewById<ImageView>(R.id.DevPfp)
        val devName = findViewById<TextView>(R.id.DevName)
        val devBio = findViewById<TextView>(R.id.DevBio)
        backButton.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

        shiftButton.setOnClickListener {
            if(devNumber == 1){
                devPfp.setImageResource(R.drawable.test2)
                devName.text = "Gabriel Montil"
                devBio.text = "Ambot oi Bio"
                shiftButton.text = "Stigma424"
                devNumber = 2
                Log.e("Notification","Inside Dev 1 ")
            }
            else if(devNumber == 2){
                devPfp.setImageResource(R.drawable.test1)
                devName.text = "John Dhenzell Ermac"
                devBio.text = "Basta Bios"
                shiftButton.text = "BonelessGod44"
                devNumber = 1
                Log.e("Notification","Inside Dev 2")
            }
            else{
                Toast.makeText(this,"Something Wrong", Toast.LENGTH_LONG).show()
            }
        }
    }

}