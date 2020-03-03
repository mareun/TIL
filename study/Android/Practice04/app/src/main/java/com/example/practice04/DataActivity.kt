package com.example.practice04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_data.*

class DataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        val image = intent.getParcelableArrayListExtra<ImageData>(MainActivity.INTENT_PARCELABLE)

        val imgSrc = _imageDetail
        val imgTitle = _imageTitle

        //imgTitle.text = ImageData.imageTitle
        //imgSrc.setImageResource(image.imageSrc)
    }
}
