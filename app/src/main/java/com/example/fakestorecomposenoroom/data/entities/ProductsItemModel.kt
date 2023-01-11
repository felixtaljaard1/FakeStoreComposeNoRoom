package com.example.fakestorecomposenoroom.data.entities


import com.google.gson.annotations.SerializedName

data class ProductsItemModel(
    @SerializedName("category")
    val category: String = "",
    @SerializedName("description")
    val description: String = "",
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("image")
    val image: String = "",
    @SerializedName("price")
    val price: Double = 0.0,
    @SerializedName("title")
    val title: String = ""
)