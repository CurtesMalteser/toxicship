package com.curtesmalteser.toxicship

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform