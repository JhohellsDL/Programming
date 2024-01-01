package com.jdlstudios.programming.ui.views

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.viewModels
import com.jdlstudios.programming.R
import com.jdlstudios.programming.data.DataSourceThemes
import com.jdlstudios.programming.databinding.FragmentExercisesBinding
import com.jdlstudios.programming.ui.adapter.ExerciseAdapter
import com.jdlstudios.programming.ui.viewmodels.ExercisesViewModel
import com.jdlstudios.programming.util.ID_THEME

class ExercisesFragment : Fragment() {

    private lateinit var binding: FragmentExercisesBinding
    private val exercisesViewModel: ExercisesViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentExercisesBinding.inflate(inflater)

        val bundle = arguments
        if (bundle != null) {
            val originCode = bundle.getInt(ID_THEME, 0)
            Log.i("asdasd", "recibidio: $originCode")

        }

        val adapterExercises = ExerciseAdapter(
            onClickListener = {
                Log.d("asdasd", "lista: asasdasd holder")
                ExerciseDetailFragment.start(
                    requireActivity().supportFragmentManager,
                    4
                )
            }
        )

        exercisesViewModel.setListExercises(DataSourceThemes.exerciseList)
        binding.recyclerViewExercises.adapter = adapterExercises

        exercisesViewModel.currentListExercises.observe(viewLifecycleOwner) {
            Log.d("asdasd", "lista: $it")
            adapterExercises.submitList(it)
        }

        return binding.root
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
