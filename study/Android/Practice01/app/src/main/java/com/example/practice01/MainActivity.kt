package com.example.practice01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var ProductList = arrayListOf<mRecyclerView>(
        mRecyclerView("aaa", "12000","10", "pro_1"),
        mRecyclerView("bbb", "1000","10", "pro_2"),
        mRecyclerView("ccc", "1200","10", "pro_3"),
        mRecyclerView("ddd", "19000","10", "pro_4"),
        mRecyclerView("fff", "15000","10", "pro_5"),
        mRecyclerView("ggg", "12000","10", "pro_1"),
        mRecyclerView("hhh", "1000","10", "pro_2"),
        mRecyclerView("iii", "1200","10", "pro_3"),
        mRecyclerView("jjj", "19000","10", "pro_4"),
        mRecyclerView("kkk", "15000","10", "pro_5")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_data_list.adapter = ExtensionDataAdapter(ProductList)

        val lm = LinearLayoutManager(this)
        rv_data_list.layoutManager = lm
        rv_data_list.setHasFixedSize(true)
    }
}
