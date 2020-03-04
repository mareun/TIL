package com.example.practice03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.practice03.FirstFragment.Companion.PRODUCT_INTENT_PARCELABLE
import kotlinx.android.synthetic.main.activity_product.*


class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val product_info = intent.getParcelableExtra<RVdata>(PRODUCT_INTENT_PARCELABLE)

        product_info_name.text = product_info!!.name
        product_info_price.text = product_info.price
        product_info_score.text = product_info.score
        //product_info_img.setImageResource(product_info.photo)
        Glide.with(this).load(product_info.photo).into(product_info_img)
        //Glide.with(holder.itemView.context).load(item.photo).into(holder.product_img)

    }


}
