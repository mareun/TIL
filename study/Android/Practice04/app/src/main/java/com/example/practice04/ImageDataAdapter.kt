package com.example.practice04

import android.content.Context
import android.media.Image
import android.media.ImageReader
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_data.view.*
import kotlinx.android.synthetic.main.item_image.view.*

class ImageDataAdapter (
    private val context : Context,
    private val Images : List<ImageData>,
    val listener : (ImageData) -> Unit
): RecyclerView.Adapter<ImageDataAdapter.ImageViewHolder>(){

    class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val imageSrc = view._image
        val title = view._imageTitle
        fun bindView(image: ImageData, listener: (ImageData) -> Unit)
        {
            imageSrc.setImageResource(image.imageSrc)
            title.text = image.imageTitle
            itemView.setOnClickListener{listener(image)}

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder
    = ImageViewHolder(LayoutInflater.from(context).inflate(
        R.layout.item_image,
        parent,
        false
    ))

    override fun getItemCount(): Int = Images.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bindView(Images[position], listener)
    }


}