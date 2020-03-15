package com.example.shoppinghome.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppinghome.R
import com.example.shoppinghome.model.Country
import kotlinx.android.synthetic.main.item_country.view.*

class CountryAdapter(var countryList: ArrayList<Country>): RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    inner class CountryViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(country: Country) {
            itemView.imgCountry.setImageResource(country.imgCountry)
            itemView.txtCountry.text = country.countryName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
        return CountryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(countryList[position])
    }
}