package com.example.practice01

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.rv_list_item.*



class ExtensionDataAdapter (
    val ProductList: ArrayList<mRecyclerView>,
    val context: Context,
    val itemSelect: (mRecyclerView) -> Unit
): RecyclerView.Adapter<ExtensionDataAdapter.ExtensionViewHolder>() {
    override fun getItemCount():Int{
        return ProductList.size
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExtensionDataAdapter.ExtensionViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.rv_list_item,
            parent,
            false
        )

        return ExtensionViewHolder(view, itemSelect)
    }
    override fun onBindViewHolder(holder:ExtensionViewHolder, position: Int){
        holder.bind(ProductList[position], context)
    }

    inner class ExtensionViewHolder(override val containerView: View, itemSelect: (mRecyclerView)->Unit)
        :RecyclerView.ViewHolder(containerView), LayoutContainer{
        var product_img = product_list_img
        var product_name = product_list_name
        var product_price = product_list_price
        var product_score = product_list_score

        fun bind(product: mRecyclerView, context:Context){
            if(product.photo != ""){
                val resourceId=context.resources.getIdentifier(
                    product.photo,
                    "drawable",
                    context.packageName
                )
                product_img?.setImageResource(resourceId)
            }
            else{
                product_img?.setImageResource(R.mipmap.ic_launcher)
            }
            product_name?.text=product.name
            product_price?.text=product.price
            product_score?.text=product.score

            itemView.setOnClickListener{itemSelect(product)}
        }
    }

}
