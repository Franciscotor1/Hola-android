package com.example.holaminiapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class GreetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greet)

        val nameInput = findViewById<EditText>(R.id.nameInput)
        val greetButton = findViewById<Button>(R.id.greetButton)
        val clearButton = findViewById<Button>(R.id.clearButton)

        // Al pulsar el botón "Saludar"
        greetButton.setOnClickListener {
            val name = nameInput.text.toString()
            if (name.isNotBlank()) {
                Toast.makeText(this, "Hola, $name!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Por favor ingresa tu nombre", Toast.LENGTH_SHORT).show()
            }
        }

        // Al pulsar el botón "Borrar"
        clearButton.setOnClickListener {
            nameInput.text.clear()
        }
    }
}
