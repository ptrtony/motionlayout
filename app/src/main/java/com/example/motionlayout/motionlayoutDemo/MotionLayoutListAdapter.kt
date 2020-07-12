package com.example.motionlayout.motionlayoutDemo

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.util.TypedValue
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.motionlayout.R
import com.example.motionlayout.motionlayoutDemo.entity.MotionLayoutListEntity
import com.example.motionlayout.motionlayoutDemo.utils.DisplayUtils.px

class MotionLayoutListAdapter constructor(var motionLayoutDatas: MutableList<MotionLayoutListEntity>?) :
    RecyclerView.Adapter<MotionLayoutListAdapter.MotionLayoutViewHolder>() {
    inner class MotionLayoutViewHolder constructor(view: View) : RecyclerView.ViewHolder(view) {
        val mTextView = view as TextView

        init {
            mTextView.setOnClickListener {
                val position = mTextView.tag as Int
                val intent = Intent(it.context, MotionLayoutDemoActivity::class.java)
                intent.putExtra("layoutId", motionLayoutDatas!![position].layoutId)
                view.context.startActivity(intent)
            }
        }
    }

    fun addData(motionLayoutListEntity: MotionLayoutListEntity) {
        motionLayoutDatas?.add(motionLayoutListEntity)
        notifyItemChanged(motionLayoutDatas!!.size - 1)
    }


    fun setNewData(mMotionLayoutDatas: MutableList<MotionLayoutListEntity>) {
        if (mMotionLayoutDatas.isNullOrEmpty()) return
        motionLayoutDatas = mMotionLayoutDatas
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MotionLayoutViewHolder {
        val textView = LayoutInflater.from(parent.context).inflate(R.layout.item_motion_text,parent,false)
        return MotionLayoutViewHolder(textView)
    }


    override fun getItemCount(): Int =
        if (motionLayoutDatas == null) 0 else motionLayoutDatas!!.size

    override fun onBindViewHolder(holder: MotionLayoutViewHolder, position: Int) {
        holder.mTextView.text = motionLayoutDatas!![position].title
        holder.mTextView.tag = position
    }
}