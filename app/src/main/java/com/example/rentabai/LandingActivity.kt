package com.example.rentabai

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class LandingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        val imageAccount: ImageView = findViewById(R.id.account_button) // Find the ImageView

        val firstFragment = HomeFragment()
        val secondFragment = SettingsFragment()
        val thirdFragment = DevProfileFragment()

        setCurrentFragment(firstFragment)

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> setCurrentFragment(firstFragment)
                R.id.nav_settings -> setCurrentFragment(secondFragment)
                R.id.nav_logout -> setCurrentFragment(thirdFragment)
            }
            true
        }


        imageAccount.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.bottomNavigationView, fragment)
            commit()
        }
    }
}
