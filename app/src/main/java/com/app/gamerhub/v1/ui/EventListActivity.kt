package com.app.gamerhub.v1.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.gamerhub.v1.R
import com.app.gamerhub.v1.adapter.EventAdapter
import com.app.gamerhub.v1.data.EventRepository

class EventListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_list)

        val rv = findViewById<RecyclerView>(R.id.rvEvents)

        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = EventAdapter(EventRepository.getEvents())
    }
}
