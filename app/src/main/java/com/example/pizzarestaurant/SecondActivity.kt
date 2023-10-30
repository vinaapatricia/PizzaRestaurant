package com.example.pizzarestaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    val TEXT_REQUEST = 2
    val EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE"
    private val LOG_TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val textView = findViewById<TextView>(R.id.name)
        textView.text = "Hello, " + message

        val btnSubmit = findViewById<Button>(R.id.button2)
        btnSubmit?.setOnClickListener {
            Log.d(LOG_TAG, "Button clicked!")
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra(EXTRA_MESSAGE, message)
            startActivity(intent);
        }
    }
}