package com.example.practice04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

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
            ImageData(R.drawable.pro_2, "LLL"),



        )
    }
}
