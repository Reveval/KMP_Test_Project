package com.mbicycle.kmptest

import com.mbicycle.kmptest.data.Product

sealed class UiState {

    data object Loading : UiState()

    data class Content(val products: List<Product>) : UiState()

    data object Error : UiState()
}
