package com.example.pizzarestaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.PackageManagerCompat.LOG_TAG


class MainActivity : AppCompatActivity() {
//    val TEXT_REQUEST = 1
//    val EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY"

    val EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE"
    private val LOG_TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val spinner = findViewById<Spinner>(R.id.spinner)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayOf("Cihampelas", " Cibiru", "Cimahi"))
        spinner.adapter = adapter


        spinner.prompt = getString(R.string.spinner_prompt)

        val nameFill = findViewById<EditText>(R.id.name_box)

        nameFill.hint = getString(R.string.prompt_name)
        val mMessageEditText = findViewById<EditText>(R.id.name_box)
        val btnSubmit = findViewById<android.widget.Button>(R.id.submit1_button)
        btnSubmit?.setOnClickListener(View.OnClickListener {
            Log.d(LOG_TAG, "Button clicked!")
            val intent = Intent(this, SecondActivity::class.java)
            val message = mMessageEditText?.text.toString()
            intent.putExtra(EXTRA_MESSAGE, message)
            startActivity(intent);
        })
    }
}