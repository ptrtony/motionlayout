package com.example.motionlayout.motionlayoutDemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.core.graphics.ColorUtils
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.motionlayout.R
import com.example.motionlayout.motionlayoutDemo.entity.MotionLayoutListEntity
import com.example.motionlayout.motionlayoutDemo.utils.DisplayUtils
import com.example.motionlayout.motionlayoutDemo.utils.DisplayUtils.px

class MainActivity2 : AppCompatActivity() {

    private val motionLayoutListDatas:MutableList<MotionLayoutListEntity> = mutableListOf()
    private val mMotionLayoutListAdapter:MotionLayoutListAdapter by lazy {
        MotionLayoutListAdapter(motionLayoutListDatas)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val mMotionLayoutListRv = findViewById<RecyclerView>(R.id.mMotionLayoutListRv)
        val motionLayout = findViewById<MotionLayout>(R.id.motionLayout)
        mMotionLayoutListRv.apply {
            layoutManager = LinearLayoutManager(this@MainActivity2,LinearLayoutManager.VERTICAL,false)
            adapter = mMotionLayoutListAdapter
            addItemDecoration(DividerItemDecoration(this@MainActivity2,DividerItemDecoration.HORIZONTAL))
        }
        motionLayoutListDatas.add(MotionLayoutListEntity(R.layout.activity_main,"Twitter splash layout demo"))
        motionLayoutListDatas.add(MotionLayoutListEntity(R.layout.activity_main1,"Text detail demo"))
        motionLayoutListDatas.add(MotionLayoutListEntity(R.layout.activity_image_face,"Music face cover demo"))
        motionLayoutListDatas.add(MotionLayoutListEntity(R.layout.activity_book_synopsis_card,"Activity book synopsis card demo"))
        motionLayoutListDatas.add(MotionLayoutListEntity(R.layout.activity_book_synopsis_screen_one,"Activity book synopsis screen one"))
//        motionLayoutListDatas.add(MotionLayoutListEntity(R.layout.activity_book_synopsis_edit,"android 11 edit anim"))
        mMotionLayoutListAdapter.setNewData(motionLayoutListDatas)

    }
}