package com.app.gamerhub.v1.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.app.gamerhub.v1.R
import com.app.gamerhub.v1.model.EventItem

class EventListAdapter(
    private val context: Context,
    private val list: List<EventItem>
) : BaseAdapter() {

    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Any = list[position]

    override fun getItemId(position: Int): Long = list[position].id.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.item_event, parent, false)

        val item = list[position]

        val img = view.findViewById<ImageView>(R.id.imgEvent)
        val nama = view.findViewById<TextView>(R.id.tvNamaEvent)
        val tanggal = view.findViewById<TextView>(R.id.tvTanggal)
        val lokasi = view.findViewById<TextView>(R.id.tvLokasi)
        val kategori = view.findViewById<TextView>(R.id.tvKategori)


        img.setImageResource(item.imageResId)
        nama.text = item.namaEvent
        tanggal.text = item.tanggal
        lokasi.text = item.lokasi
        kategori.text = item.kategori


        return view
    }
}
