package com.jdlstudios.programming.ui.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.viewModels
import com.jdlstudios.programming.R
import com.jdlstudios.programming.data.DataSourceExercisesDetail
import com.jdlstudios.programming.data.DataSourceThemes
import com.jdlstudios.programming.databinding.FragmentExercisesBinding
import com.jdlstudios.programming.model.ThemeModel
import com.jdlstudios.programming.ui.adapter.ExerciseAdapter
import com.jdlstudios.programming.ui.viewmodels.ExercisesViewModel
import com.jdlstudios.programming.util.ID_THEME

class ExercisesFragment : Fragment() {

    private lateinit var binding: FragmentExercisesBinding
    private val exercisesViewModel: ExercisesViewModel by viewModels()
    private var themeModel: ThemeModel? = null
    private var idTheme: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentExercisesBinding.inflate(inflater)

        arguments?.let {
            idTheme = it.getInt(ID_THEME, 0)
            getTheme(idTheme)
        }

        val adapterExercises = ExerciseAdapter(
            onClickListener = {
                ExerciseDetailFragment.start(
                    requireActivity().supportFragmentManager,
                    idExercise = it.id,
                    idTheme = idTheme
                )
            }
        )

        binding.titleLabel.text = "Exercises - ${themeModel?.title}"

        themeModel?.let {
            DataSourceExercisesDetail.getListExercisesSummary(it.id)
        }?.let {
            exercisesViewModel.setListExercises(it)
        }

        binding.recyclerViewExercises.adapter = adapterExercises

        exercisesViewModel.currentListExercises.observe(viewLifecycleOwner) {
            adapterExercises.submitList(it)
        }

        return binding.root
    }

    private fun getTheme(id: Int) {
        DataSourceThemes.getThemeById(id)?.let {
            themeModel = it
        }
    }

    companion object {
        fun start(
            fragmentManager: FragmentManager,
            idTheme: Int
        ) {
            val fragment = ExercisesFragment().apply {
                arguments = Bundle().apply {
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

    fun makeCurrentFragment(fragment: Fragment) {
        requireActivity().supportFragmentManager.beginTransaction().apply {
            replace(R.id.nav_host_fragment, fragment)
            addToBackStack(null)
            commit()
        }
    }

}
