package com.example.practice03

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_first.view.*
import kotlin.collections.ArrayList

class FirstFragment : Fragment() {
    lateinit var recycle01 : RecyclerView
    private val list = ArrayList<RVdata>()

    companion object{
        val PRODUCT_INTENT_PARCELABLE = "product_info"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)
        var v : View = inflater.inflate(
            R.layout.fragment_first,
            container,
            false
        )

        recycle01 = v.rv_data_list
        val adpater = RecyclerViewAdapterProduct(list) { RVdata ->
            val intent = Intent(context, ProductActivity::class.java)
            intent.putExtra(PRODUCT_INTENT_PARCELABLE,RVdata)
            startActivity(intent)
        }
        recycle01.layoutManager = LinearLayoutManager(activity)
        recycle01.adapter = adpater
        return v
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        list.add(RVdata("aaa", "12000원", "9.5점",R.drawable.pro_1))
        list.add(RVdata("abb", "1000원", "9점",R.drawable.pro_2))
        list.add(RVdata("acc", "19000원", "5점",R.drawable.pro_3))
        list.add(RVdata("bbb", "99700원", "1점",R.drawable.pro_4))
        list.add(RVdata("ccc", "3300원", "2점",R.drawable.pro_5))
        list.add(RVdata("ddd", "4000원", "3.5점",R.drawable.pro_1))
        list.add(RVdata("gg", "8000원", "10점",R.drawable.pro_2))
        list.add(RVdata("aq", "2000원", "10점",R.drawable.pro_3))
        list.add(RVdata("qpdoe", "300원", "2.5점",R.drawable.pro_4))
        list.add(RVdata("vvv", "3300원", "6.5점",R.drawable.pro_5))
        list.add(RVdata("sdf", "100원", "8.5점",R.drawable.pro_1))
        list.add(RVdata("qwe", "12원", "1.5점",R.drawable.pro_2))
        list.add(RVdata("vas", "9990원", "6.5점",R.drawable.pro_3))
        list.add(RVdata("dasf", "190000원", "7점",R.drawable.pro_4))
        list.add(RVdata("dd", "1222원", "8점",R.drawable.pro_5))
        list.add(RVdata("ppp", "12030원", "1점",R.drawable.pro_1))
    }
}