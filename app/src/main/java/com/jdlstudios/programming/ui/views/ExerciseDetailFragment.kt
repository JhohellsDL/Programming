package com.jdlstudios.programming.ui.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.jdlstudios.programming.R
import com.jdlstudios.programming.data.DataSourceExercisesDetail
import com.jdlstudios.programming.databinding.FragmentExerciseDetailBinding
import com.jdlstudios.programming.model.ExerciseDetailModel
import com.jdlstudios.programming.util.Difficult
import com.jdlstudios.programming.util.ID_EXERCISE
import com.jdlstudios.programming.util.ID_THEME

class ExerciseDetailFragment : Fragment() {

    private lateinit var binding: FragmentExerciseDetailBinding
    private val dataSource = DataSourceExercisesDetail
    private var exerciseDetailModel: ExerciseDetailModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentExerciseDetailBinding.inflate(inflater)

        arguments?.let {
            val idExercise = it.getInt(ID_EXERCISE, 0)
            val idTheme = it.getInt(ID_THEME, 0)
            getExercise(idTheme, idExercise)
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

    private fun fillData() {
        exerciseDetailModel?.let {
            binding.titleExercise.text = it.title
            binding.descriptionExercise.text = it.description
            binding.textDate.text = it.date
            binding.textDifficult.text = Difficult.getDifficultName(it.difficulty)
            binding.textTimeEstimated.text = it.time
            binding.textTimeUser.text = it.timeUser
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

}