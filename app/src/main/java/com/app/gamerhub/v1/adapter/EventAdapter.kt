package com.app.gamerhub.v1.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.app.gamerhub.v1.R
import com.app.gamerhub.v1.model.EventItem
import com.app.gamerhub.v1.ui.EventDetailActivity

class EventAdapter(private val eventList: List<EventItem>) :
    RecyclerView.Adapter<EventAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val img: ImageView = view.findViewById(R.id.imgEvent)
        val nama: TextView = view.findViewById(R.id.tvNamaEvent)
        val tanggal: TextView = view.findViewById(R.id.tvTanggal)
        val lokasi: TextView = view.findViewById(R.id.tvLokasi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_event, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val event = eventList[position]

        holder.img.setImageResource(event.imageResId)
        holder.nama.text = event.namaEvent
        holder.tanggal.text = event.tanggal
        holder.lokasi.text = event.lokasi

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, EventDetailActivity::class.java)
            intent.putExtra("EVENT_ID", event.id)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = eventList.size
}
