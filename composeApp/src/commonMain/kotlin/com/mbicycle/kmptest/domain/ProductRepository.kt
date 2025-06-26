package com.mbicycle.kmptest.domain

import com.mbicycle.kmptest.data.Product

class ProductRepository : IProductRepository {

    override fun getProducts(): List<Product> {
        return List(20) { index ->
            Product(
                title = "Title $index",
                description = "Description $index",
                iconUrl = "https://img.icons8.com/?size=100&id=llh1YDy0vaIl&format=png&color=000000"
            )
        }
    }
}
