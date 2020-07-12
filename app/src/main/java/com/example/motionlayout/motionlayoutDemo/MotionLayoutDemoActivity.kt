package com.example.motionlayout.motionlayoutDemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.motionlayout.R

class MotionLayoutDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layoutId = intent.getIntExtra("layoutId",0)
        setContentView(layoutId)
    }
}