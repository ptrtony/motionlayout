package com.example.motionlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        imageView2.setOnClickListener {
            Handler().postDelayed({
                startActivity(Intent(this,Main1Activity::class.java))
            },1001)
        }
    }
}