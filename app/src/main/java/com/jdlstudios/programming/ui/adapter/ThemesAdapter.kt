package com.jdlstudios.programming.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.jdlstudios.programming.databinding.ThemeItemBinding
import com.jdlstudios.programming.model.ThemeModel

class ThemesAdapter(
    private val onClickListener: (ThemeModel) -> Unit
) : ListAdapter<ThemeModel, ThemesAdapter.ThemeViewHolder>(
    ThemeModelDiffCallback()
) {

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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThemeViewHolder {
        return ThemeViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ThemeViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(
            item,
            onClickListener
        )
    }

    class ThemeModelDiffCallback :
        DiffUtil.ItemCallback<ThemeModel>() {
        override fun areItemsTheSame(oldItem: ThemeModel, newItem: ThemeModel): Boolean {
            return newItem.title == oldItem.title
        }

        override fun areContentsTheSame(oldItem: ThemeModel, newItem: ThemeModel): Boolean {
            return oldItem == newItem
        }
    }
}
