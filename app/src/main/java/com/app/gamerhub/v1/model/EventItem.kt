package com.app.gamerhub.v1.model

data class EventItem(
    val id: Int,
    val namaEvent: String,
    val penyelenggara: String,
    val tanggal: String,
    val lokasi: String,
    val deskripsi: String,
    val imageResId: Int,
    val kategori: String
)
