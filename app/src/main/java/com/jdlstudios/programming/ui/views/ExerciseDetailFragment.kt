package com.jdlstudios.programming.ui.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jdlstudios.programming.R
import com.jdlstudios.programming.databinding.FragmentExerciseDetailBinding

class ExerciseDetailFragment : Fragment() {

    private lateinit var binding: FragmentExerciseDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentExerciseDetailBinding.inflate(inflater)



        return binding.root
    }

}