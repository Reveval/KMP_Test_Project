package com.mbicycle.kmptest.di

import com.mbicycle.kmptest.ProductViewModel
import com.mbicycle.kmptest.domain.IProductRepository
import com.mbicycle.kmptest.domain.ProductRepository
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    singleOf(::ProductRepository) { bind<IProductRepository>() }
    viewModelOf(::ProductViewModel)
}
