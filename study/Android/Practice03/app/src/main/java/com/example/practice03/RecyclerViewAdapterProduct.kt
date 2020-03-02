package com.example.practice03

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_data_list_item.view.*
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class RecyclerViewAdapterProduct (val ProductList: ArrayList<RVdata>, val itemClick: (RVdata)->Unit)
    : RecyclerView.Adapter<RecyclerViewAdapterProduct.RecyclerViewHolder>(){
    inner class RecyclerViewHolder(itemView: View ,val itemClick: (RVdata)->Unit):RecyclerView.ViewHolder(itemView){
        var product_img = itemView.product_list_img
        var product_name = itemView.product_list_name
        var product_price = itemView.product_list_price
        var product_score = itemView.product_list_score
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(
            R.layout.rv_data_list_item,
            parent,
            false
        )
        return RecyclerViewHolder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return ProductList.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val item : RVdata = ProductList[position]
        holder.product_name.text = item.name
        holder.product_price.text = item.price
        holder.product_score.text = item.score
        Glide.with(holder.itemView.context).load(item.photo).apply(RequestOptions()).into(holder.product_img)

        holder.itemView.setOnClickListener{itemClick(item)}
    }
}