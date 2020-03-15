package com.example.shoppinghome.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager

import com.example.shoppinghome.R
import com.example.shoppinghome.adapter.CountryAdapter
import com.example.shoppinghome.model.Country
import kotlinx.android.synthetic.main.fragment_country.view.*
import kotlinx.android.synthetic.main.fragment_latest.view.*

/**
 * A simple [Fragment] subclass.
 */
class CountryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root = inflater.inflate(R.layout.fragment_country, container, false)

        var countryArray = ArrayList<Country>()
        countryArray.add(Country(R.drawable.japan, "Japan"))
        countryArray.add(Country(R.drawable.korea, "Korea"))
        countryArray.add(Country(R.drawable.china, "China"))
        countryArray.add(Country(R.drawable.international, "International"))

        var countryAdapter = CountryAdapter(countryArray)
        root.recycler_country.layoutManager = GridLayoutManager(context, 2)
        root.recycler_country.adapter = countryAdapter

        return root
    }

}
