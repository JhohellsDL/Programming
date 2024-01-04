package com.jdlstudios.programming.ui.viewholders

import android.content.Context
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
import com.jdlstudios.programming.databinding.ThemeItemBinding
import com.jdlstudios.programming.model.ThemeModel
import com.jdlstudios.programming.util.Difficult

class ThemeViewHolder private constructor(private val binding: ThemeItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(
        item: ThemeModel,
        onClickListener: (ThemeModel) -> Unit
    ) {
        binding.titleTheme.text = item.title
        binding.timeEstimatedTheme.text = binding.root.context.getString(R.string.time_estimated, item.timeEstimated)
        binding.descriptionTheme.text = item.shortDescription
        binding.textDifficultTheme.text = Difficult.getDifficultName(item.difficult)
        binding.radioButtonTheme.isChecked = item.complete
        binding.imageTheme.setImageResource(item.image)

        hideShowLine(item)
        applyColorCardChips(item)

        itemView.setOnClickListener { onClickListener(item) }
    }

    companion object {
        fun from(parent: ViewGroup): ThemeViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ThemeItemBinding.inflate(layoutInflater, parent, false)
            return ThemeViewHolder(binding)
        }
    }

    private fun applyColorCardChips(item: ThemeModel) {
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

        binding.cardDifficultTheme.setCardStrokeColor(darkColor)
        binding.layoutDifficultTheme.setBackgroundColorCompat(lightColor)
        binding.textDifficultTheme.setTextColorCompat(darkColor)
    }

    private fun hideShow(view: View, idTarget: Int, id: Int) {
        view.visibility = if (id == idTarget) View.GONE else View.VISIBLE
    }

    private fun hideShowLines(item: ThemeModel) {
        hideShow(binding.lineUp, 100, item.id)
        hideShow(binding.lineDown, 2000, item.id)
    }

    private fun hideShowLine(item: ThemeModel) {
        hideShowLines(item)
    }

    private fun Context.getColorCompat(@ColorRes colorResId: Int): Int {
        return ContextCompat.getColor(this, colorResId)
    }

    private fun View.setCardStrokeColor(@ColorInt color: Int) {
        if (this is MaterialCardView) {
            strokeColor = color
        }
    }

    private fun View.setBackgroundColorCompat(@ColorInt color: Int) {
        setBackgroundColor(color)
    }

    private fun TextView.setTextColorCompat(@ColorInt color: Int) {
        setTextColor(color)
    }
}