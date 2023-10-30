package com.example.pizzarestaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ThirdActivity : AppCompatActivity() {
    val EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE"
    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val pepperoniView = findViewById<View>(R.id.pepperoni)
        pepperoniView.setOnClickListener {
            Toast.makeText(this, "Anda telah memilih Pepperoni", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, FourActivity::class.java)
            startActivity(intent)
        }

//        view.findViewById<ImageView>(R.id.pepperoni)
//            .setOnClickListener(View.OnClickListener {
//                displayToast(getResources().getString(R.string.donut_order_message))
//            })
//
//
//        view.findViewById<ImageView>(R.id.burger)
//            .setOnClickListener(View.OnClickListener {
//                displayToast(getString(R.string.ice_cream_order_message))
//            })
//
//
//        view.findViewById<ImageView>(R.id.steak)
//            .setOnClickListener(View.OnClickListener {
//                displayToast(getString(R.string.froyo_order_message))
//            })
        }
// val message = intent.getStringExtra(EXTRA_MESSAGE)
    //val textView = findViewById<TextView>(R.id.menu)

//        val recyclerView = findViewById<RecyclerView>(R.id.rv_menu)
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.setHasFixedSize(true)
//        recyclerView.adapter = MenuAdapter(this, menuList) { menu ->
//            Toast.makeText(this, "Anda memilih ${menu.namaMenu}", Toast.LENGTH_SHORT).show()
//            val intent = Intent(this, DetailMenu::class.java)
//            intent.putExtra(INTENT_PARCELABLE, menu)
//            startActivity(intent)



    }
