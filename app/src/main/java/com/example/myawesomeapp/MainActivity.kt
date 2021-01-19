package com.example.myawesomeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1: Button = findViewById(R.id.button1)
        val b2: Button = findViewById(R.id.button2)
        val b3: Button = findViewById(R.id.button3)

        b1.setOnClickListener{
            Log.e("!@#$", "Button1 clicked")
        }
        b2.setOnClickListener{
            Log.e("!@#$", "Button2 clicked")
        }
        b3.setOnClickListener{
            Log.e("!@#$", "Button3 clicked")
        }
    }


}