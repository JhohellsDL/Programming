package com.jdlstudios.programming.ui.viewholders

import android.content.Context
import android.content.res.ColorStateList
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import com.jdlstudios.programming.R
import com.jdlstudios.programming.databinding.ExerciseItemBinding
import com.jdlstudios.programming.model.ExerciseModel
import com.jdlstudios.programming.util.Difficult

class ExerciseViewHolder private constructor(private val binding: ExerciseItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(
        item: ExerciseModel,
        onClickListener: (ExerciseModel) -> Unit
    ) {
        binding.titleExercise.text = item.title
        binding.descriptionExercise.text = item.description
        binding.textDifficultExercise.text = Difficult.getDifficultName(item.difficult)
        binding.checkboxExercise.isChecked = item.complete

        applyColorCardChips(item)

        itemView.setOnClickListener { onClickListener(item) }
    }

    companion object {
        fun from(parent: ViewGroup): ExerciseViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ExerciseItemBinding.inflate(layoutInflater, parent, false)
            return ExerciseViewHolder(binding)
        }
    }

    private fun applyColorCardChips(item: ExerciseModel) {
        when (item.difficult) {
            Difficult.EASY.ordinal -> {
                applyColorDifficulty(
                    R.color.color_difficult_easy_stroke,
                    R.color.color_difficult_easy
                )
            }

            Difficult.MIDDLE.ordinal -> {
                applyColorDifficulty(
                    R.color.color_difficult_middle_stroke,
                    R.color.color_difficult_middle
                )
            }

            Difficult.HARD.ordinal -> {
                applyColorDifficulty(
                    R.color.color_difficult_hard_stroke,
                    R.color.color_difficult_hard
                )
            }

            Difficult.EXPERT.ordinal -> {
                applyColorDifficulty(
                    R.color.color_difficult_expert_stroke,
                    R.color.color_difficult_expert
                )
            }
        }
    }

    private fun applyColorDifficulty(color: Int, color2: Int) {
        val darkColor = binding.root.context.getColorCompat(color)
        val lightColor = binding.root.context.getColorCompat(color2)

        binding.layoutDifficultExercise.setBackgroundColorTintCompat(lightColor)
        binding.textDifficultExercise.setTextColorCompat(darkColor)
    }

    private fun Context.getColorCompat(@ColorRes colorResId: Int): Int {
        return ContextCompat.getColor(this, colorResId)
    }

    private fun View.setBackgroundColorTintCompat(@ColorInt color: Int) {
        backgroundTintList = ColorStateList.valueOf(color)
    }

    private fun TextView.setTextColorCompat(@ColorInt color: Int) {
        setTextColor(color)
    }
}