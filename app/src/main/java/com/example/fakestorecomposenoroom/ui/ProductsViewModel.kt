package com.example.fakestorecomposenoroom.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fakestorecomposenoroom.domain.AppRepository
import com.example.fakestorecomposenoroom.domain.GetProductsUseCase
import com.example.fakestorecomposenoroom.domain.item.ProductItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductsViewModel @Inject constructor(
    private val getProductsUseCase: GetProductsUseCase
): ViewModel(){

    private val _products = MutableStateFlow(emptyList<ProductItem>())
    val products: StateFlow<List<ProductItem>> get() = _products

    init{
        getProducts()
        Log.i("WhereIsData", products.toString())

    }

    private fun getProducts() {
        viewModelScope.launch {

            try{
                val products = getProductsUseCase()
                _products.value = products
                Log.i("WhereIsData", "Please Halp4")

            } catch (error: Exception){
                Log.i("where is data",error.toString())
            }
        }
    }
}