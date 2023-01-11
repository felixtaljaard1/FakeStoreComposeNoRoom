package com.example.fakestorecomposenoroom.domain.item

import com.example.fakestorecomposenoroom.data.entities.ProductsItemModel
import com.google.gson.annotations.SerializedName

data class ProductItem(
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

fun ProductsItemModel.toProductItem() = ProductItem(category,description, id, image, price, title)
