package com.app.gamerhub.v1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.gamerhub.v1.databinding.ActivityMainBinding
import android.content.Intent

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate layout
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()
    }

    private fun setupUI() {
        // Greeting
        binding.incHeader.tvGreeting.text = "Selamat datang di Gamerhub 👋"

        // Subtitle / info
        binding.incHeader.tvLocation.text = "Top-up game favoritmu dengan mudah"

        // Search hint
        binding.incSearch.etSearch.hint = "Cari game (ML, FF, PUBG...)"
        binding.incPromo.btnExplore.setOnClickListener {

        }
        binding.incPromo.btnExplore.setOnClickListener {
            startActivity(Intent(this, GameListActivity::class.java))
        }

    }
}