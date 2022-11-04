package com.example.gamegym

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
var a: Int = 1
var d: Int = 1
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView = findViewById<ImageView>(R.id.imageView3)
        var textView = findViewById<TextView>(R.id.textView)
        var button = findViewById<Button>(R.id.button)
        imageView.setOnClickListener {
            d += a * 1
            textView.text = "Result is: $d"
        }
        button.setOnClickListener{
            val intent = Intent(applicationContext, ShopActivity::class.java)
            intent.putExtra("a", "d")
            startActivity(intent)
        }
    }
}