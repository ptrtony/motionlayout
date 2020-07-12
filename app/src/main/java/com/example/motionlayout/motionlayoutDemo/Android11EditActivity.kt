//package com.example.motionlayout.motionlayoutDemo
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.WindowInsets
//import android.view.WindowInsetsAnimation
//import android.widget.EditText
//import com.example.motionlayout.R
//
//class Android11EditActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_android11_edit)
//        val mEditText = findViewById<EditText>(R.id.mEditText)
//        mEditText.setWindowInsetsAnimationCallback(callback)
//
//    }
//
//    val callback = object:android.view.WindowInsetsAnimation.Callback(DISPATCH_MODE_STOP){
//        override fun onProgress(
//            p0: WindowInsets,
//            p1: MutableList<WindowInsetsAnimation>
//        ): WindowInsets {
//            val windowInsets = WindowInsets(p0)
//            return windowInsets
//        }
//
//    }
//}