package com.example.shoppinghome.model

data class Product (
    var imgProduct: Int,
    var name: String,
    var brand: String,
    var rating: Float,
    var price: Int,
    var discountPercent: Int,
    var discountPrice: Int,
    var newest: Boolean
)