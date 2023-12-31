package com.jdlstudios.programming.ui.views

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.jdlstudios.programming.R
import com.jdlstudios.programming.databinding.FragmentPriorKnowledgeBinding
import com.jdlstudios.programming.ui.viewmodels.PriorKnowledgeViewModel

class PriorKnowledgeFragment : Fragment() {
    private lateinit var binding: FragmentPriorKnowledgeBinding
    // Instancia del ViewModel
    private val priorKnowledgeViewModel: PriorKnowledgeViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPriorKnowledgeBinding.inflate(inflater)
        Log.d("asdasd", "lista: as")
        // Observar los cambios en currentListThemes
        priorKnowledgeViewModel.currentListThemes.observe(viewLifecycleOwner) {
            // Actualizar la interfaz de usuario con la nueva lista de temas
            // Aquí puedes manejar la lógica para mostrar los temas en tu fragmento
            Log.d("asdasd", "lista: $it")
            // Por ejemplo, podrías actualizar un RecyclerView o cualquier otro componente de la interfaz de usuario
        }

        return binding.root
    }

}