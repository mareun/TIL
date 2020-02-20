package com.example.practice03

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.ArrayList

class FirstFragment : Fragment() {

    val dataArray: ArrayList<String> = ArrayList()
    lateinit var recyclerView01: RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater.inflate(R.layout.rv_data_list_item, container, false)

        addDataArray()
        recyclerView01 = rootView.findViewById(R.id.rv_data_list)as RecyclerView
        recyclerView01.layoutManager = LinearLayoutManager(requireContext())
        recyclerView01.adapter = DataAdapter(dataArray, requireContext())

        return rootView

    }
    private fun addDataArray(){
        dataArray.add("여기에")
        dataArray.add("배열의")
        dataArray.add("문자열")
        dataArray.add("알아서")
        dataArray.add("변환해서")
        dataArray.add("들어가기")
        dataArray.add("그랬으면")
        dataArray.add("좋겠다")
        dataArray.add("졸작")
        dataArray.add("화이팅")
        dataArray.add("실행결과")
        dataArray.add("조금만더")
        dataArray.add("써서")
        dataArray.add("스크롤")
        dataArray.add("밑으로")
        dataArray.add("내려가는지")
        dataArray.add("봐야지")
        dataArray.add("그래야")
        dataArray.add("잘")
        dataArray.add("보이지")
    }
}