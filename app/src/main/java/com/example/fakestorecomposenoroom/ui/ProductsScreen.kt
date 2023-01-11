package com.example.fakestorecomposenoroom.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.fakestorecomposenoroom.data.entities.Products
import com.example.fakestorecomposenoroom.data.entities.ProductsItemModel
import com.example.fakestorecomposenoroom.domain.item.ProductItem
import androidx.compose.foundation.Image


@Composable
fun ProductsScreen(){
    val productsViewModel = viewModel(modelClass = ProductsViewModel::class.java)
    val products by productsViewModel.products.collectAsState()

    LazyColumn{
        items(products){ product: ProductItem ->
            ProductsCard(product = product)
        }
    }
}

@Composable
fun ProductsCard(product: ProductItem){
    val image = rememberImagePainter(data = product.image)

    Card(
        elevation = 5.dp,
        shape = RoundedCornerShape(5.dp),
        modifier = Modifier
            .padding(top = 5.dp, bottom = 5.dp, start=10.dp, end=10.dp)
            .fillMaxSize()
    ){

        Column{
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth().height(250.dp)
            )

            Column(modifier = Modifier.padding(10.dp)){
                Text(text = product.title, fontWeight = FontWeight.Bold)
                Text(text = product.description)
            }

        }
    }
}