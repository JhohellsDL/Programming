package com.jdlstudios.programming.ui.views

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.jdlstudios.programming.R
import com.jdlstudios.programming.data.DataSourceThemes
import com.jdlstudios.programming.databinding.FragmentThemesBinding
import com.jdlstudios.programming.ui.adapter.ThemesAdapter
import com.jdlstudios.programming.ui.viewmodels.PriorKnowledgeViewModel
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
                Log.d("asdasd", "lista: asasdasd holder")
                ExercisesFragment.start(
                    requireActivity().supportFragmentManager,
                    2
                )
            }
        )

        themesViewModel.setListThemes(DataSourceThemes.themeList)
        binding.recyclerViewThemes.adapter = adapterTheme

        themesViewModel.currentListThemes.observe(viewLifecycleOwner) {
            Log.d("asdasd", "lista: $it")
            adapterTheme.submitList(it)
        }

        return binding.root
    }
    private fun makeCurrentFragment(fragment: Fragment) {
        requireActivity().supportFragmentManager.beginTransaction().apply {
            replace(R.id.nav_host_fragment, fragment)
            addToBackStack(null)
            commit()
        }
    }

}