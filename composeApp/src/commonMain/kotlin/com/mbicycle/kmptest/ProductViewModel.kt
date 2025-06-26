package com.mbicycle.kmptest

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mbicycle.kmptest.domain.IProductRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class ProductViewModel(
    private val productRepository: IProductRepository,
) : ViewModel() {

    private val uiState: MutableStateFlow<UiState> = MutableStateFlow(UiState.Loading)
    internal val getUiState: StateFlow<UiState> = uiState.asStateFlow()

    internal fun loadProducts() = viewModelScope.launch {
        // Emit loading
        uiState.update { UiState.Loading }
        // Imitation of network request
        delay(2000)

        val products = productRepository.getProducts()
        uiState.update { UiState.Content(products) }
    }

    internal fun onButtonClick() {
        loadProducts()
    }
}