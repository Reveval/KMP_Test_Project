package com.mbicycle.kmptest

import androidx.compose.ui.window.ComposeUIViewController
import com.mbicycle.kmptest.di.initKoin

fun MainViewController() = ComposeUIViewController(configure = { initKoin() }) { App() }