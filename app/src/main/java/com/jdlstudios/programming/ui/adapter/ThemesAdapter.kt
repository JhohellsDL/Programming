package com.jdlstudios.programming.ui.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.jdlstudios.programming.model.ThemeModel
import com.jdlstudios.programming.ui.viewholders.ThemeViewHolder

class ThemesAdapter(
    private val onClickListener: (ThemeModel) -> Unit
) : ListAdapter<ThemeModel, ThemeViewHolder>(
    ThemeModelDiffCallback()
) {
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
