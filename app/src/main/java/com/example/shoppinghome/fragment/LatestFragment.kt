package com.example.shoppinghome.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.shoppinghome.R
import com.example.shoppinghome.adapter.LatestAdapter
import com.example.shoppinghome.model.Product
import kotlinx.android.synthetic.main.fragment_latest.view.*

/**
 * A simple [Fragment] subclass.
 */
class LatestFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root = inflater.inflate(R.layout.fragment_latest, container, false)

        var latestArray = ArrayList<Product>()
        latestArray.add(Product(R.drawable.bag, "Hyde Park N41015", "LOUIS VUITTON", 4F, 99999999, 20, 211000, true))
        latestArray.add(Product(R.drawable.shirt, "HORNS PINK LONG SLEEVE SHIRT", "Lady Gaga", 5F, 72000, 0, 0, true))
        latestArray.add(Product(R.drawable.iphone, "Iphone 8 Plus", "Apple", 4F, 980000, 30, 110000, true))

        var latestAdapter = LatestAdapter(latestArray)
        root.recycler_latest.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        root.recycler_latest.adapter = latestAdapter

        return root
    }

}
