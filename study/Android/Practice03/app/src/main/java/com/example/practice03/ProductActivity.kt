package com.example.practice03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        setOnClickListner()
    }

    fun setOnClickListner(){
        val product_info = intent.getParcelableExtra<RVdata?>("product_info_key")

            product_info_name.text = product_info!!.name
            product_info_price.text = product_info.price
            product_info_score.text = product_info.score
            product_info_img.setImageResource(product_info.photo)

    }



}
