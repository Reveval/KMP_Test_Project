package com.mbicycle.kmptest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform