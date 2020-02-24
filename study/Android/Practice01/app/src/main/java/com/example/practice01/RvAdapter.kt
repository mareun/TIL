package com.example.practice01

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.rv_list_item.view.*

class RvAdapter(
    val context: Context,
    val ProductList: ArrayList<mRecyclerView>
): RecyclerView.Adapter<RvAdapter.mViewH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mViewH {
        return mViewH(LayoutInflater.from(context).inflate(
            R.layout.rv_list_item,
            parent,
            false
        ))
    }

    override fun getItemCount(): Int {
        return ProductList.size
    }

    override fun onBindViewHolder(holder: mViewH, position: Int) {
        holder.bind(ProductList[position], context)
    }

    class ExtensionViewHolder(override val containerView: View): RecyclerView.ViewHolder(containerView), LayoutContainer
    {
        //
    }

    class mViewH(view:View) : RecyclerView.ViewHolder(view){
        var product_img = view.product_list_img
        var product_name = view.product_list_name
        var product_price = view.product_list_price
        var product_score = view.product_list_score

        fun bind(product: mRecyclerView, context: Context){
            if(product.photo !=""){
                val resourceId = context.resources.getIdentifier(product.photo, "drawable", context.packageName)
                product_img?.setImageResource(resourceId)
            }else{
                product_img?.setImageResource(R.mipmap.ic_launcher)
            }
            product_name?.text=product.name
            product_price?.text=product.price
            product_score?.text=product.score
        }
    }

}