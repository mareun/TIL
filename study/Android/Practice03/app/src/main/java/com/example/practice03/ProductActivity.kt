package com.example.practice03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
    }
        val product_info = intent.getParcelableExtra<RVdata>(FirstFragment.INTENT_PARCELABLE)

        val product_img = product_info_img.drawable
        val product_name = product_info_name.text
        val product_price = product_info_price.text
        val product_score = product_info_score.text

}
