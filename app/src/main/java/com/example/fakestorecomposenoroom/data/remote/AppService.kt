package com.example.fakestorecomposenoroom.data.remote

import android.util.Log
import com.example.fakestorecomposenoroom.data.entities.ProductsItemModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class AppService @Inject constructor(private val appApi: AppApi){

    suspend fun getProducts(): List<ProductsItemModel>{
        Log.i("WhereIsData", "Please Help")

        return withContext(Dispatchers.IO){
            val products = appApi.getAllProducts()
            products.body() ?: emptyList()
        }
    }
}