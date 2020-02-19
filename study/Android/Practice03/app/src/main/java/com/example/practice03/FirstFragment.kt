package com.example.practice03

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    val dataArray: ArrayList<String> = ArrayList()

    private fun addDataArray(){
        dataArray.add("1")
        dataArray.add("2")
        dataArray.add("3")
        dataArray.add("4")
        dataArray.add("5")
        dataArray.add("6")
        dataArray.add("7")
        dataArray.add("8")
        dataArray.add("9")
        dataArray.add("10")
        dataArray.add("11")
        dataArray.add("12")
        dataArray.add("13")
        dataArray.add("14")
        dataArray.add("15")
        dataArray.add("16")
        dataArray.add("17")
        dataArray.add("18")
        dataArray.add("19")
        dataArray.add("20")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        addDataArray()
        rv_data_list.layoutManager = LinearLayoutManager(this)
        rv_data_list.adapter = DataAdapter(dataArray, this)

        return inflater.inflate(R.layout.fragment_first, container, false)

    }


}