package com.example.fakestorecomposenoroom.domain

import android.util.Log
import com.example.fakestorecomposenoroom.data.entities.ProductsItemModel
import com.example.fakestorecomposenoroom.domain.item.ProductItem
import javax.inject.Inject

class GetProductsUseCase @Inject constructor(private val appRepository: AppRepository){

    suspend operator fun invoke(): List<ProductItem>{
        return appRepository.performGetProducts()
        Log.i("WhereIsData", "Please Help 3")

    }
}