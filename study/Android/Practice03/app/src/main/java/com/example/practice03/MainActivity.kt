package com.example.practice03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    //private lateinit var viewAdaper: RecyclerViewAdapterProduct
    //private lateinit var viewmanager: RecyclerView.LayoutManager


    val MainAdapter: MainAdapter by lazy {
        MainAdapter(4, supportFragmentManager)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        frame_home.adapter = MainAdapter
        frame_home.offscreenPageLimit = 4

        setOnClickListner()

    }

    fun setOnClickListner() {
        /********버튼 클릭시 fragment 이동*********/
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

        /*******LoginActivity에서 intent로 값 전달****/
        if (intent.hasExtra("id_key")) {
            login_id_view.text = intent.getStringExtra("id_key")
        } else {
            Toast.makeText(this, "전달된 id가 없습니다.", Toast.LENGTH_SHORT).show()
        }

        if (intent.hasExtra("pw_key")) {
            login_pw_view.text = intent.getStringExtra("pw_key")
        } else {
            Toast.makeText(this, "전달된 pw가 없습니다.", Toast.LENGTH_SHORT).show()
        }
    }
}

