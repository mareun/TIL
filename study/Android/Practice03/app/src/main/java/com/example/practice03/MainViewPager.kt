package com.example.practice03

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.viewpager.widget.ViewPager

// 스와이프 막기
class MainViewPager(ctx: Context, attr: AttributeSet) : ViewPager(ctx, attr)
{
    override fun onTouchEvent(ev: MotionEvent?): Boolean {
        return false
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        return false
    }
}