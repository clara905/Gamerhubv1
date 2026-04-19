package com.app.gamerhub.v1.ui

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.app.gamerhub.v1.R
import com.app.gamerhub.v1.data.EventRepository

class EventListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_list)

        // 🔙 Back
        val btnBack = findViewById<ImageView>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }

        // 📋 ListView
        val listView = findViewById<ListView>(R.id.listEvents)
        val events = EventRepository.getEvents()

        val adapter = EventListAdapter(this, events)
        listView.adapter = adapter

        // 🔥 Klik item → ke detail
        listView.setOnItemClickListener { _, _, position, _ ->
            val event = events[position]

            val intent = Intent(this, EventDetailActivity::class.java)
            intent.putExtra("EVENT_ID", event.id)
            startActivity(intent)
        }
    }
}
