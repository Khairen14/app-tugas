package com.example.afinal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btncpu: ImageButton = findViewById(R.id.imageButton)
        btncpu.setOnClickListener(this)
        val btnMe: TextView = findViewById(R.id.abot)
        btnMe.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
    when (v?.id){
        R.id.imageButton->{
            val btnIntent = Intent(this@MainActivity, cpu::class.java)
            startActivity(btnIntent)
        }
    }
        when (v?.id){
            R.id.abot ->{
                val btnIntent = Intent(this@MainActivity, abot::class.java)
                startActivity(btnIntent)
            }
        }
    }

}














