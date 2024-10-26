package com.example.holaminiapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goToAppButton = findViewById<Button>(R.id.goToAppButton)

        // Al pulsar "Ir a la app"
        goToAppButton.setOnClickListener {
            val intent = Intent(this, GreetActivity::class.java)
            startActivity(intent)
        }
    }
}
