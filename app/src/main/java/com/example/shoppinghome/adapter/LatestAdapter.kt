package com.example.shoppinghome.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppinghome.R
import com.example.shoppinghome.model.Product
import kotlinx.android.synthetic.main.item_latest.view.*

class LatestAdapter(var productList: ArrayList<Product>): RecyclerView.Adapter<LatestAdapter.LatestViewHolder>() {

    inner class LatestViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(product: Product) {
            itemView.imgLatest.setImageResource(product.imgProduct)
            itemView.txtLatestName.text = product.name
            itemView.txtLatestBrand.text = product.brand
            itemView.ratingLatest.rating = product.rating
            itemView.txtLatestPrice.text = product.price.toString()+" KS"
            itemView.txtLatestDiscount.text = product.discountPrice.toString()+" KS"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_latest, parent, false)
        return LatestViewHolder(view)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: LatestViewHolder, position: Int) {
        holder.bind(productList[position])
    }
}