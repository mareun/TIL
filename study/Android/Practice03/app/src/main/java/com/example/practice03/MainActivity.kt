package com.example.practice03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val MainAdapter: MainAdapter by lazy {
        MainAdapter(4, supportFragmentManager)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        frame_home.adapter=MainAdapter
        frame_home.offscreenPageLimit = 4

        setOnClickListner()

    }

    fun setOnClickListner()
    {
        btn1.setOnClickListener()
        {
            frame_home.currentItem = 0
        }
        btn2.setOnClickListener()
        {
            frame_home.currentItem = 1
        }
        btn3.setOnClickListener()
        {
            frame_home.currentItem = 2
        }
        btn4.setOnClickListener()
        {
            frame_home.currentItem = 3
        }
    }
}
