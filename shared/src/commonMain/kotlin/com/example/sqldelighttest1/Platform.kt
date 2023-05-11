package com.example.sqldelighttest1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform