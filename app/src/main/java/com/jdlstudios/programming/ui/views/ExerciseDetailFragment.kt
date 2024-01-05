package com.jdlstudios.programming.ui.views

import android.content.Context
import android.content.res.ColorStateList
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.jdlstudios.programming.R
import com.jdlstudios.programming.data.DataSourceExercisesDetail
import com.jdlstudios.programming.data.DataSourceThemes
import com.jdlstudios.programming.databinding.FragmentExerciseDetailBinding
import com.jdlstudios.programming.model.ExerciseDetailModel
import com.jdlstudios.programming.model.ExerciseModel
import com.jdlstudios.programming.model.ThemeModel
import com.jdlstudios.programming.util.Difficult
import com.jdlstudios.programming.util.ID_EXERCISE
import com.jdlstudios.programming.util.ID_THEME

class ExerciseDetailFragment : Fragment() {

    private lateinit var binding: FragmentExerciseDetailBinding
    private val dataSource = DataSourceExercisesDetail
    private val dataSourceThemes = DataSourceThemes
    private var exerciseDetailModel: ExerciseDetailModel? = null
    private var currentTheme: ThemeModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentExerciseDetailBinding.inflate(inflater)

        arguments?.let {
            val idExercise = it.getInt(ID_EXERCISE, 0)
            val idTheme = it.getInt(ID_THEME, 0)
            getExercise(idTheme, idExercise)
            getTheme(idTheme)
        }

        fillData()
        return binding.root
    }

    private fun getExercise(idTheme: Int, idExercise: Int) {
        exerciseDetailModel = dataSource.getExerciseDetail(
            idTheme = idTheme,
            idExercise = idExercise
        )
    }

    private fun getTheme(idTheme: Int) {
        currentTheme = dataSourceThemes.getThemeById(
            id = idTheme
        )
    }

    private fun fillData() {
        exerciseDetailModel?.let {
            binding.titleExercise.text = it.title
            binding.descriptionExercise.text = it.description
            binding.textDifficult.text = Difficult.getDifficultName(it.difficulty)
            binding.textTimeEstimated.text = it.timeUser
            binding.textTimeUser.text = it.time

            applyColorToBackground(it)
        }
        currentTheme?.let {
            binding.textTheme.text = it.title
        }
    }

    companion object {
        fun start(
            fragmentManager: FragmentManager,
            idExercise: Int,
            idTheme: Int
        ) {
            val fragment = ExerciseDetailFragment().apply {
                arguments = Bundle().apply {
                    putInt(ID_EXERCISE, idExercise)
                    putInt(ID_THEME, idTheme)
                }
            }
            fragmentManager.beginTransaction().apply {
                replace(R.id.nav_host_fragment, fragment)
                addToBackStack(null)
                commit()
            }
        }
    }

    private fun applyColorToBackground(item: ExerciseDetailModel) {
        when (item.difficulty) {
            Difficult.EASY.ordinal -> {
                applyColorDifficulty(
                    R.color.color_difficult_easy
                )
            }

            Difficult.MIDDLE.ordinal -> {
                applyColorDifficulty(
                    R.color.color_difficult_middle
                )
            }

            Difficult.HARD.ordinal -> {
                applyColorDifficulty(
                    R.color.color_difficult_hard
                )
            }

            Difficult.EXPERT.ordinal -> {
                applyColorDifficulty(
                    R.color.color_difficult_expert
                )
            }
        }
    }

    private fun applyColorDifficulty(color: Int) {
        val lightColor = binding.root.context.getColorCompat(color)

        binding.constraintViewBackground.setBackgroundColorTintCompat(lightColor)
    }

    private fun Context.getColorCompat(@ColorRes colorResId: Int): Int {
        return ContextCompat.getColor(this, colorResId)
    }

    private fun View.setBackgroundColorTintCompat(@ColorInt color: Int) {
        backgroundTintList = ColorStateList.valueOf(color)
    }
}