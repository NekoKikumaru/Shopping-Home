package com.example.shoppinghome.adapter

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppinghome.R
import com.example.shoppinghome.model.Product
import kotlinx.android.synthetic.main.item_popular.view.*

class PopularAdapter(var popularList: ArrayList<Product>): RecyclerView.Adapter<PopularAdapter.PopularViewHolder>() {

    inner class PopularViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(product: Product) {
            if (product.newest == false) {
                itemView.txtNew.visibility = View.GONE
            }
            if (product.discountPercent != 0) {
                itemView.txtDiscountPercent.text = product.discountPercent.toString()+"% off"
                itemView.txtPopularDiscount.text = product.discountPrice.toString()+" KS"
                itemView.txtPopularDiscount.paintFlags = Paint.STRIKE_THRU_TEXT_FLAG
            }
            else {
                itemView.txtDiscountPercent.visibility = View.GONE
                itemView.txtPopularDiscount.visibility = View.GONE
            }
            itemView.txtPopularName.text = product.name
            itemView.txtPopularBrand.text = product.brand
            itemView.ratingPopular.rating = product.rating
            itemView.txtPopularPrice.text = product.price.toString()+" KS"
            itemView.imgPopular.setImageResource(product.imgProduct)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_popular, parent, false)
        return PopularViewHolder(view)
    }

    override fun getItemCount(): Int {
        return popularList.size
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        holder.bind(popularList[position])
    }

}