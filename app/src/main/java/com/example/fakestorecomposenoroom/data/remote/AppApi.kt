package com.example.fakestorecomposenoroom.data.remote

import com.example.fakestorecomposenoroom.data.entities.ProductsItemModel
import retrofit2.Response
import retrofit2.http.GET

interface AppApi {
    @GET("products")
    suspend fun getAllProducts(): Response<List<ProductsItemModel>>
}