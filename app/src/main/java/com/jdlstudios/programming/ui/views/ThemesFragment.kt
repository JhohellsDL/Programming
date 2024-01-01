package com.jdlstudios.programming.ui.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.jdlstudios.programming.data.DataSourceThemes
import com.jdlstudios.programming.databinding.FragmentThemesBinding
import com.jdlstudios.programming.ui.adapter.ThemesAdapter
import com.jdlstudios.programming.ui.viewmodels.ThemesViewModel

class ThemesFragment : Fragment() {

    private lateinit var binding: FragmentThemesBinding

    private val themesViewModel: ThemesViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThemesBinding.inflate(inflater)

        val adapterTheme = ThemesAdapter(
            onClickListener = {
                ExercisesFragment.start(
                    fragmentManager = requireActivity().supportFragmentManager,
                    idTheme = it.id
                )
            }
        )

        themesViewModel.setListThemes(DataSourceThemes.themeList)
        binding.recyclerViewThemes.adapter = adapterTheme

        themesViewModel.currentListThemes.observe(viewLifecycleOwner) {
            adapterTheme.submitList(it)
        }

        return binding.root
    }

}