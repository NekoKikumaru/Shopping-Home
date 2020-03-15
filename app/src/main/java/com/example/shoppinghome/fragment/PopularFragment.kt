package com.example.shoppinghome.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.shoppinghome.R
import com.example.shoppinghome.adapter.PopularAdapter
import com.example.shoppinghome.model.Product
import kotlinx.android.synthetic.main.fragment_popular.view.*

/**
 * A simple [Fragment] subclass.
 */
class PopularFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root = inflater.inflate(R.layout.fragment_popular, container, false)

        var popularArray = ArrayList<Product>()
        popularArray.add(Product(R.drawable.iphone, "Iphone 8 Plus", "Apple", 4F, 980000, 30, 110000, true))
        popularArray.add(Product(R.drawable.bed, "GhostBed 11 Inch Cooling Get Memory Form...", "Apple", 4F, 325000, 34, 495000, true))
        popularArray.add(Product(R.drawable.nintendo, "Nintendo Switch - Neon Blue and Red Joy Con", "Nintendo", 4F, 359000, 0, 0, false))
        popularArray.add(Product(R.drawable.dress, "BELAROI Womens Comfy Swing Tunic Short...", "Apple", 4F, 189900, 0, 0, true))

        var popularAdapter = PopularAdapter(popularArray)
        root.recycler_popular.layoutManager = LinearLayoutManager(context)
        root.recycler_popular.adapter = popularAdapter

        return root
    }

}
