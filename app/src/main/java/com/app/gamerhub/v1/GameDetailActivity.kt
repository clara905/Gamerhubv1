package com.app.gamerhub.v1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.app.gamerhub.v1.data.GameTopUpRepository
import com.app.gamerhub.v1.databinding.ActivityGameDetailBinding
import java.text.NumberFormat
import java.util.Locale

class GameDetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_GAME_ID = "extra_game_id"
    }

    private lateinit var binding: ActivityGameDetailBinding

    private val rupiah =
        NumberFormat.getCurrencyInstance(Locale("id", "ID"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gameId = intent.getIntExtra(EXTRA_GAME_ID, -1)
        val game = GameTopUpRepository.getGameTopUpById(gameId)

        game?.let {
            binding.imgGame.setImageResource(it.imageResId)
            binding.tvGameName.text = it.gameName
            binding.tvMeta.text = "${it.publisher} • ${it.category} • ⭐ ${it.rating}"
            binding.tvPrice.text = rupiah.format(it.price)
            binding.tvDesc.text = "Top up ${it.gameName} dengan cepat, aman, dan terpercaya."
        }

        binding.btnTopUp.setOnClickListener {
            Toast.makeText(this, "Top Up berhasil! 🎮", Toast.LENGTH_SHORT).show()
        }
    }
}