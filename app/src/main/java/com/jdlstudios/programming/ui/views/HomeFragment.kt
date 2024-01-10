package com.jdlstudios.programming.ui.views

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jdlstudios.programming.R
import com.jdlstudios.programming.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        val progressAnimator = ObjectAnimator.ofInt(binding.progressCircularHome, "progress", 0, 80)
        progressAnimator.duration = 1000
        val progressAnimator2 = ObjectAnimator.ofInt(binding.progressCircularThemesHome, "progress", 0, 70)
        progressAnimator2.duration = 1000// Duración de la animación en milisegundos

        progressAnimator2.start()
        progressAnimator.start()

        val valueAnimator = ValueAnimator.ofInt(0, 50)
        valueAnimator.duration = 1000 // Duración de la animación en milisegundos
        valueAnimator.addUpdateListener {
            val animatedValue = it.animatedValue as Int
            binding.numberThemesHome.text = animatedValue.toString()
            binding.numberExercisesHome.text = animatedValue.toString()
            binding.numberHoursHome.text = animatedValue.toString()
            binding.numberOthersHome.text = animatedValue.toString()
        }
        valueAnimator.start()
    }
}