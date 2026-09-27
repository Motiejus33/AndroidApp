package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button = findViewById<Button>(R.id.button2)
        val textView = findViewById<TextView>(R.id.textView)

        button.setOnClickListener {
            textView.text = "Mygtukas paspaustas"
        }

        val button3 = findViewById<Button>(R.id.button3)

        button3.setOnClickListener {
            textView.setTextColor(Color.GREEN)
        }

        val button4 = findViewById<Button>(R.id.button4)

        button4.setOnClickListener {
            textView.setBackgroundColor(Color.YELLOW)
        }
    }
}