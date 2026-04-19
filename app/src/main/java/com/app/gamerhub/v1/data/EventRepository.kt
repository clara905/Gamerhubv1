package com.app.gamerhub.v1.data

import com.app.gamerhub.v1.R
import com.app.gamerhub.v1.model.EventItem

object EventRepository {

    fun getEvents(): List<EventItem> {
        return listOf(
            EventItem(
                1,
                "MLBB Championship",
                "GamerHub",
                "20 April 2026",
                "Online",
                "Turnamen Mobile Legends terbesar dengan hadiah jutaan rupiah.",
                R.drawable.ml,
                "Tournament"
            ),
            EventItem(
                2,
                "FF Battle Arena",
                "Garena",
                "25 April 2026",
                "Jakarta",
                "Event Free Fire seru dengan banyak hadiah menarik.",
                R.drawable.ff,
                "Esports"
            ),
            EventItem(
                3,
                "PUBG Open",
                "Tencent",
                "30 April 2026",
                "Online",
                "Kompetisi PUBG Mobile terbuka untuk semua player.",
                R.drawable.pubg,
                "Tournament"
            ),
            EventItem(
                4,
                "CODM War",
                "Activision",
                "5 Mei 2026",
                "Bandung",
                "Event komunitas Call of Duty Mobile dengan berbagai challenge.",
                R.drawable.codm,
                "Community"
            )
        )
    }

    fun getEventById(id: Int): EventItem? {
        return getEvents().find { it.id == id }
    }
}
