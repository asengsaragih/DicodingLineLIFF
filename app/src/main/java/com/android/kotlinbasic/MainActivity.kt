package com.android.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text: TextView = findViewById(R.id.textview)

        text.setOnClickListener {
            checkToast()
        }
    }

    private fun checkToast() {
        Toast.makeText(applicationContext, "Hello World", Toast.LENGTH_SHORT).show()
    }
}
