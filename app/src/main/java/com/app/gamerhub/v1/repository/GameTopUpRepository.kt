package com.app.gamerhub.v1.data

import com.app.gamerhub.v1.R
import com.app.gamerhub.v1.model.GameTopUp

object GameTopUpRepository {

    fun getGameTopUps(): List<GameTopUp> {
        return listOf(
            GameTopUp(
                id = 1,
                gameName = "Mobile Legends",
                publisher = "Moonton",
                category = "MOBA",
                price = 15000,
                rating = 4.8,
                isPopular = true,
                imageResId = R.drawable.ml
            ),
            GameTopUp(
                id = 2,
                gameName = "Free Fire",
                publisher = "Garena",
                category = "Battle Royale",
                price = 12000,
                rating = 4.7,
                isPopular = true,
                imageResId = R.drawable.ff
            ),
            GameTopUp(
                id = 3,
                gameName = "PUBG Mobile",
                publisher = "Tencent",
                category = "Battle Royale",
                price = 20000,
                rating = 4.6,
                isPopular = false,
                imageResId = R.drawable.pubg
            ),
            GameTopUp(
                id = 4,
                gameName = "Call of Duty Mobile",
                publisher = "Activision",
                category = "FPS",
                price = 18000,
                rating = 4.5,
                isPopular = false,
                imageResId = R.drawable.codm
            )
        )
    }

    fun getGameTopUpById(id: Int): GameTopUp? {
        return getGameTopUps().find { it.id == id }
    }
}