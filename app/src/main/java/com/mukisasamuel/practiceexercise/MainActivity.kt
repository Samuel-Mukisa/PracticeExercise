package com.mukisasamuel.practiceexercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val m = findViewById<Button>(R.id.ablog)
        val n = findViewById<TextView>(R.id.absigin)
        m.setOnClickListener {
           val k = Intent(this, HomeActivity::class.java)
           startActivity(k)
        }
        n.setOnClickListener {
            val h = Intent(this, Signup::class.java)
            startActivity(h)
        }

    }
}