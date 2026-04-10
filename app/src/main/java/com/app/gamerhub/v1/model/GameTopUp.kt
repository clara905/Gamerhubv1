package com.app.gamerhub.v1.model

data class GameTopUp(
    val id: Int,
    val gameName: String,
    val publisher: String,
    val category: String,    // MOBA, FPS, Battle Royale
    val price: Int,
    val rating: Double,
    val isPopular: Boolean,
    val imageResId: Int
)