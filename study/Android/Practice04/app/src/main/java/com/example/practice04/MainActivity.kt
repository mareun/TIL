package com.example.practice04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList = listOf<ImageData>(
            ImageData(R.drawable.pro_1, "AAA"),
            ImageData(R.drawable.pro_2, "BBB"),
            ImageData(R.drawable.pro_3, "CCC"),
            ImageData(R.drawable.pro_4, "DDD"),
            ImageData(R.drawable.pro_5, "EEE"),
            ImageData(R.drawable.pro_1, "FFF"),
            ImageData(R.drawable.pro_2, "GGG"),
            ImageData(R.drawable.pro_3, "HHH"),
            ImageData(R.drawable.pro_4, "III"),
            ImageData(R.drawable.pro_5, "JJJ"),
            ImageData(R.drawable.pro_1, "KKK"),
            ImageData(R.drawable.pro_2, "LLL")
        )
        val recyclerView = findViewById<RecyclerView>(R.id.imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageDataAdapter(this, imageList){
            val intent = Intent(this, DataActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}
