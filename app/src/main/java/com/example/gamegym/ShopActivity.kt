package com.example.gamegym

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ShopActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)
        var imageView1 = findViewById<ImageView>(R.id.imageView1)
        var imageView2 = findViewById<ImageView>(R.id.imageView2)
        var imageView3 = findViewById<ImageView>(R.id.imageView3)
        var imageView4 = findViewById<ImageView>(R.id.imageView4)
        imageView1.setOnClickListener {
            if (d >= 50){
                a = 8
            }
        }
        imageView2.setOnClickListener {
            if (d >= 500){
                a = 32
            }
        }
        imageView3.setOnClickListener {
            if (d >= 5000){
                a = 1024
            }
        }
        imageView4.setOnClickListener {
            if (d >= 500000){
                a = 4024
            }
        }
    }
}