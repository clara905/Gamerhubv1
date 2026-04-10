package com.app.gamerhub.v1.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.app.gamerhub.v1.databinding.ItemGameRowBinding
import com.app.gamerhub.v1.model.GameTopUp
import java.text.NumberFormat
import java.util.Locale

class GameTopUpListAdapter(
    context: Context,
    private val items: List<GameTopUp>
) : ArrayAdapter<GameTopUp>(context, 0, items) {

    private val rupiah =
        NumberFormat.getCurrencyInstance(Locale("id", "ID"))

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val binding: ItemGameRowBinding
        val view: View

        if (convertView == null) {
            binding = ItemGameRowBinding.inflate(
                LayoutInflater.from(context),
                parent,
                false
            )
            view = binding.root
            view.tag = binding
        } else {
            view = convertView
            binding = view.tag as ItemGameRowBinding
        }

        val item = items[position]

        binding.imgGame.setImageResource(item.imageResId)
        binding.tvGameName.text = item.gameName
        binding.tvPublisher.text = item.publisher
        binding.tvCategory.text = item.category
        binding.tvPrice.text = rupiah.format(item.price)
        binding.tvRating.text = "⭐ ${item.rating}"

        // Optional: tampilkan label popular
        if (item.isPopular) {
            binding.tvPopular.visibility = View.VISIBLE
            binding.tvPopular.text = "🔥 Popular"
        } else {
            binding.tvPopular.visibility = View.GONE
        }

        return view
    }
}