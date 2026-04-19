package com.app.gamerhub.v1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.gamerhub.v1.data.GameTopUpRepository
import com.app.gamerhub.v1.databinding.ActivityGameListBinding
import com.app.gamerhub.v1.ui.GameTopUpListAdapter

class GameListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGameListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val games = GameTopUpRepository.getGameTopUps()
        val adapter = GameTopUpListAdapter(this, games)

        // Set adapter ke ListView
        binding.listGames.adapter = adapter

        // 🔥 Klik item → ke detail
        binding.listGames.setOnItemClickListener { _, _, position, _ ->
            val item = games[position]

            val intent = Intent(this, GameDetailActivity::class.java)
            intent.putExtra(GameDetailActivity.EXTRA_GAME_ID, item.id)
            startActivity(intent)
        }

        // 🔙 Back button (DI LUAR)
        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}
