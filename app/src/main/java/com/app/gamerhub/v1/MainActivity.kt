package com.app.gamerhub.v1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.gamerhub.v1.databinding.ActivityMainBinding
import com.app.gamerhub.v1.ui.EventListActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()
    }

    private fun setupUI() {
        // Greeting
        binding.incHeader.tvGreeting.text = "Selamat datang di Gamerhub 👋"

        // Subtitle
        binding.incHeader.tvLocation.text = "Top-up game favoritmu dengan mudah"

        // Search
        binding.incSearch.etSearch.hint = "Cari game (ML, FF, PUBG...)"

        // 🔥 Button ke Game List
        binding.incPromo.btnExplore.setOnClickListener {
            startActivity(Intent(this, GameListActivity::class.java))
        }

        // 🔥 Button ke Event (PASTIKAN ADA DI XML)
        binding.btnEvent.setOnClickListener {
            startActivity(Intent(this, EventListActivity::class.java))
        }
    }
}
