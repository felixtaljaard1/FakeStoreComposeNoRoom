package com.example.fakestorecomposenoroom.domain

import android.util.Log
import com.example.fakestorecomposenoroom.data.entities.ProductsItemModel
import com.example.fakestorecomposenoroom.data.remote.AppService
import com.example.fakestorecomposenoroom.domain.item.ProductItem
import com.example.fakestorecomposenoroom.domain.item.toProductItem
import javax.inject.Inject

class AppRepository @Inject constructor(private val appService: AppService){
    suspend fun performGetProducts() : List<ProductItem>{
        Log.i("WhereIsData", "Please Help 2")

        return appService.getProducts().map{
            it.toProductItem()
        }
    }

}