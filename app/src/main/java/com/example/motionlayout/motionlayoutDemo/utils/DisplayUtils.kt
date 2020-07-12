package com.example.motionlayout.motionlayoutDemo.utils

import android.content.res.Resources
import android.util.TypedValue

object DisplayUtils {

    fun Int.px():Int{
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_PX,this.toFloat(),Resources.getSystem().displayMetrics).toInt()
    }
}