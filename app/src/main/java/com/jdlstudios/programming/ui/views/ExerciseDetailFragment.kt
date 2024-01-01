package com.jdlstudios.programming.ui.views

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.jdlstudios.programming.R
import com.jdlstudios.programming.databinding.FragmentExerciseDetailBinding
import com.jdlstudios.programming.util.ID_EXERCISE

class ExerciseDetailFragment : Fragment() {

    private lateinit var binding: FragmentExerciseDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentExerciseDetailBinding.inflate(inflater)

        val bundle = arguments
        if (bundle != null){
            val idExercise = bundle.getInt(ID_EXERCISE, 0)
            Log.i("asdasd", "recuperdo: $idExercise")
        }


        return binding.root
    }

    companion object {
        fun start(
            fragmentManager: FragmentManager,
            idExercise: Int
        ){
            val fragment = ExerciseDetailFragment().apply {
                arguments = Bundle().apply {
                    putInt(ID_EXERCISE, idExercise)
                }
            }
            fragmentManager.beginTransaction().apply {
                replace( R.id.nav_host_fragment, fragment)
                addToBackStack(null)
                commit()
            }
        }
    }

}