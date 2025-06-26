package com.mbicycle.kmptest.domain

import com.mbicycle.kmptest.data.Product

interface IProductRepository {

    fun getProducts(): List<Product>
}
