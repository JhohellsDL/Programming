package com.jdlstudios.programming.ui.viewholders

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jdlstudios.programming.databinding.ExerciseItemBinding
import com.jdlstudios.programming.model.ExerciseModel

class ExerciseViewHolder private constructor(private val binding: ExerciseItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(
        item: ExerciseModel,
        onClickListener: (ExerciseModel) -> Unit
    ) {
        binding.titleExercise.text = item.title
        binding.descriptionExercise.text = item.description

        itemView.setOnClickListener { onClickListener(item) }
    }

    companion object {
        fun from(parent: ViewGroup): ExerciseViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ExerciseItemBinding.inflate(layoutInflater, parent, false)
            return ExerciseViewHolder(binding)
        }
    }

}