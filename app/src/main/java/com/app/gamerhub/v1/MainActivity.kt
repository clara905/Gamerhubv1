package com.app.gamerhub.v1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.gamerhub.v1.databinding.ActivityMainBinding
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
        binding.tvGreeting.text = "Selamat datang di Gamerhub 👋"

        // Subtitle / info
        binding.tvLocation.text = "Top-up game favoritmu dengan mudah"

        // Search hint
        binding.etSearch.hint = "Cari game (ML, FF, PUBG...)"
    }
}