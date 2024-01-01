package com.jdlstudios.programming.ui.viewholders

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jdlstudios.programming.databinding.ThemeItemBinding
import com.jdlstudios.programming.model.ThemeModel

class ThemeViewHolder private constructor(private val binding: ThemeItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(
        item: ThemeModel,
        onClickListener: (ThemeModel) -> Unit
    ) {
        binding.titleTheme.text = item.title
        binding.descriptionTheme.text = item.description

        itemView.setOnClickListener { onClickListener(item) }
    }

    companion object {
        fun from(parent: ViewGroup): ThemeViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ThemeItemBinding.inflate(layoutInflater, parent, false)
            return ThemeViewHolder(binding)
        }
    }
}