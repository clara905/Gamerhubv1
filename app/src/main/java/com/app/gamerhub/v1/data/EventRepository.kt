package com.app.gamerhub.v1.data

import com.app.gamerhub.v1.R
import com.app.gamerhub.v1.model.EventItem

object EventRepository {

    private val eventList = listOf(
        EventItem(
            id = 1,
            namaEvent = "MLBB Championship",
            penyelenggara = "GamerHub",
            tanggal = "20 April 2026",
            lokasi = "Online",
            deskripsi = "Turnamen Mobile Legends terbesar dengan hadiah jutaan rupiah.",
            imageResId = R.drawable.ml,
            kategori = "Tournament"
        ),
        EventItem(
            id = 2,
            namaEvent = "FF Battle Arena",
            penyelenggara = "Garena",
            tanggal = "25 April 2026",
            lokasi = "Jakarta",
            deskripsi = "Event Free Fire seru dengan banyak hadiah menarik.",
            imageResId = R.drawable.ff,
            kategori = "Esports"
        ),
        EventItem(
            id = 3,
            namaEvent = "PUBG Open",
            penyelenggara = "Tencent",
            tanggal = "30 April 2026",
            lokasi = "Online",
            deskripsi = "Kompetisi PUBG Mobile terbuka untuk semua player.",
            imageResId = R.drawable.pubg,
            kategori = "Tournament"
        ),
        EventItem(
            id = 4,
            namaEvent = "CODM War",
            penyelenggara = "Activision",
            tanggal = "5 Mei 2026",
            lokasi = "Bandung",
            deskripsi = "Event komunitas Call of Duty Mobile dengan berbagai challenge.",
            imageResId = R.drawable.codm,
            kategori = "Community"
        )
    )

    fun getEvents(): List<EventItem> = eventList

    fun getEventById(id: Int): EventItem? {
        return eventList.find { it.id == id }
    }
}
