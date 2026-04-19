package com.app.gamerhub.v1.ui

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.app.gamerhub.v1.R
import com.app.gamerhub.v1.data.EventRepository

class EventDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_detail)

        val eventId = intent.getIntExtra("EVENT_ID", -1)
        val event = EventRepository.getEventById(eventId)

        val imgEvent = findViewById<ImageView>(R.id.imgEvent)
        val tvNama = findViewById<TextView>(R.id.tvNamaEvent)
        val tvPenyelenggara = findViewById<TextView>(R.id.tvPenyelenggara)
        val tvTanggal = findViewById<TextView>(R.id.tvTanggal)
        val tvLokasi = findViewById<TextView>(R.id.tvLokasi)
        val tvKategori = findViewById<TextView>(R.id.tvKategori)
        val tvDeskripsi = findViewById<TextView>(R.id.tvDeskripsi)
        val btn = findViewById<Button>(R.id.btnDaftar)
        val btnBack = findViewById<ImageView>(R.id.btnBack)

        event?.let {
            // 🔥 INI BAGIAN PENTING
            imgEvent.setImageResource(it.imageResId)

            tvNama.text = it.namaEvent
            tvPenyelenggara.text = it.penyelenggara
            tvTanggal.text = it.tanggal
            tvLokasi.text = it.lokasi
            tvKategori.text = it.kategori
            tvDeskripsi.text = it.deskripsi
        }

        btn.setOnClickListener {
            Toast.makeText(this, "Berhasil daftar event! 🎮", Toast.LENGTH_SHORT).show()
        }

        btnBack.setOnClickListener {
            finish()
        }

    }
}
