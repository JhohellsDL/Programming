package com.jdlstudios.programming.ui.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.jdlstudios.programming.model.ExerciseModel
import com.jdlstudios.programming.ui.viewholders.ExerciseViewHolder

class ExerciseAdapter(
    private val onClickListener: (ExerciseModel) -> Unit
) : ListAdapter<ExerciseModel, ExerciseViewHolder>(
    ExerciseModelDiffCallback()
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseViewHolder {
        return ExerciseViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ExerciseViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(
            item,
            onClickListener
        )
    }

    class ExerciseModelDiffCallback :
        DiffUtil.ItemCallback<ExerciseModel>() {
        override fun areItemsTheSame(oldItem: ExerciseModel, newItem: ExerciseModel): Boolean {
            return newItem.title == oldItem.title
        }

        override fun areContentsTheSame(oldItem: ExerciseModel, newItem: ExerciseModel): Boolean {
            return oldItem == newItem
        }
    }

}