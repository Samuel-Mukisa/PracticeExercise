package com.mukisasamuel.practiceexercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        val a = findViewById<Button>(R.id.ablogin)
        val b = findViewById<TextView>(R.id.idalready)
        a.setOnClickListener{
            val e = Intent(this,HomeActivity::class.java)
            startActivity(e)
        }
        b.setOnClickListener{
            val c = Intent(this,MainActivity::class.java)
            startActivity(c)
        }
    }
}