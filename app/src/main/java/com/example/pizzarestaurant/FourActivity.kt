package com.example.pizzarestaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class FourActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)

        val button3 = findViewById<Button>(R.id.btnOrder)
        button3.setOnClickListener {
            Toast.makeText(this, "Anda telah memesan Pepperoni", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, FiveActivity::class.java)
            startActivity(intent)

            val buttonback = findViewById<Button>(R.id.btnback)
                buttonback.setOnClickListener {
                    val intent = Intent(this, ThirdActivity::class.java)
                }
        }
    }
}