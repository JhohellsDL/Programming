package com.jdlstudios.programming.ui.views

import android.content.Context
import android.content.res.ColorStateList
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.jdlstudios.programming.R
import com.jdlstudios.programming.databinding.FragmentPriorKnowledgeBinding

class PriorKnowledgeFragment : Fragment() {
    private lateinit var binding: FragmentPriorKnowledgeBinding
    private var id: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPriorKnowledgeBinding.inflate(inflater)
        activeButtonProcedure()

        binding.layoutButtonProcedure.setOnClickListener {
            restartButtonThemes()
            restartButtonSymbols()
            restartButtonOther()
            activeButtonProcedure()

            fillFieldsContent()
        }

        binding.layoutButtonThemes.setOnClickListener {
            restartButtonProcedures()
            restartButtonSymbols()
            restartButtonOther()
            activeButtonThemes()

            fillFieldsContent2()
        }

        binding.layoutButtonSymbols.setOnClickListener {
            restartButtonProcedures()
            restartButtonThemes()
            restartButtonOther()
            activeButtonSymbols()

            fillFieldsContent3()
        }
        binding.layoutButtonOther.setOnClickListener {
            restartButtonProcedures()
            restartButtonThemes()
            restartButtonSymbols()
            activeButtonOther()
        }

        return binding.root
    }

    private fun fillFieldsContent() {
        binding.titleContentKnowledge.text = "Elaborar un algoritmo"
        binding.descriptionContentKnowledge.text =
            "Elaborar un algoritmo para resolver un problema es un proceso que implica varios pasos.\n\nRecuerda que la resolución de problemas es una habilidad que se mejora con la práctica. Cuanto más te enfrentes a problemas y diseñes algoritmos para resolverlos, mejor te volverás en este proceso."
        binding.imageContentKnowledgeBig.setImageResource(R.drawable.algoritmo)
    }

    private fun fillFieldsContent2() {
        binding.titleContentKnowledge.text = "Temario genaral para aprender a programar"
        binding.descriptionContentKnowledge.text =
            "Aquí tienes un temario general para aprender a programar en Kotlin. Ten en cuenta que este temario está estructurado de manera progresiva, pero puedes adaptarlo según tus preferencias y necesidades."
        binding.imageContentKnowledgeBig.setImageResource(R.drawable.temas_importantes)
    }

    private fun fillFieldsContent3() {
        binding.titleContentKnowledge.text = "Temario genaral para aprender a programar"
        binding.descriptionContentKnowledge.text =
            "Aquí tienes un temario general para aprender a programar en Kotlin. Ten en cuenta que este temario está estructurado de manera progresiva, pero puedes adaptarlo según tus preferencias y necesidades."
        binding.imageContentKnowledgeBig.setImageResource(R.drawable.diagram_flow)
    }


    private fun activeButtonOther() {
        val backgroundColor = binding.root.context.getColorCompat(R.color.color_difficult_easy)
        binding.layoutButtonOther.setBackgroundColorTintCompat(backgroundColor)
        binding.viewAuxOther1.setBackgroundColorCompat(backgroundColor)
        binding.viewAuxOther2.setBackgroundColorCompat(backgroundColor)

        binding.viewAuxSymbols2.setBackgroundColorCompat(backgroundColor)
        binding.viewAuxBottom.setBackgroundColorCompat(backgroundColor)
    }

    private fun restartButtonOther() {
        val lightColor = binding.root.context.getColorCompat(R.color.background_purple_super_light)
        binding.layoutButtonOther.setBackgroundColorTintCompat(lightColor)
        binding.viewAuxOther1.setBackgroundColorCompat(lightColor)
        binding.viewAuxOther2.setBackgroundColorCompat(lightColor)

        binding.viewAuxSymbols2.setBackgroundColorCompat(lightColor)
        binding.viewAuxBottom.setBackgroundColorCompat(lightColor)
    }

    private fun activeButtonSymbols() {
        val backgroundColor = binding.root.context.getColorCompat(R.color.color_difficult_easy)
        binding.layoutButtonSymbols.setBackgroundColorTintCompat(backgroundColor)
        binding.viewAuxSymbols1.setBackgroundColorCompat(backgroundColor)
        binding.viewAuxSymbols2.setBackgroundColorCompat(backgroundColor)

        binding.viewAuxThemes2.setBackgroundColorCompat(backgroundColor)
        binding.viewAuxOther1.setBackgroundColorCompat(backgroundColor)
    }

    private fun restartButtonSymbols() {
        val lightColor = binding.root.context.getColorCompat(R.color.background_purple_super_light)
        binding.layoutButtonSymbols.setBackgroundColorTintCompat(lightColor)
        binding.viewAuxSymbols1.setBackgroundColorCompat(lightColor)
        binding.viewAuxSymbols2.setBackgroundColorCompat(lightColor)

        binding.viewAuxThemes2.setBackgroundColorCompat(lightColor)
        binding.viewAuxOther1.setBackgroundColorCompat(lightColor)

    }

    private fun restartButtonProcedures() {
        val lightColor = binding.root.context.getColorCompat(R.color.background_purple_super_light)
        binding.layoutButtonProcedure.setBackgroundColorTintCompat(lightColor)
        binding.viewAuxProcedure1.setBackgroundColorCompat(lightColor)
        binding.viewAuxProcedure2.setBackgroundColorCompat(lightColor)

        binding.viewAuxTop.setBackgroundColorCompat(lightColor)
        binding.viewAuxThemes1.setBackgroundColorCompat(lightColor)
    }

    private fun restartButtonThemes() {
        val lightColor = binding.root.context.getColorCompat(R.color.background_purple_super_light)
        binding.layoutButtonThemes.setBackgroundColorTintCompat(lightColor)
        binding.viewAuxThemes1.setBackgroundColorCompat(lightColor)
        binding.viewAuxThemes2.setBackgroundColorCompat(lightColor)

        binding.viewAuxProcedure2.setBackgroundColorCompat(lightColor)
        binding.viewAuxSymbols1.setBackgroundColorCompat(lightColor)
    }

    private fun activeButtonThemes() {
        val backgroundColor = binding.root.context.getColorCompat(R.color.color_difficult_easy)
        binding.layoutButtonThemes.setBackgroundColorTintCompat(backgroundColor)
        binding.viewAuxThemes1.setBackgroundColorCompat(backgroundColor)
        binding.viewAuxThemes2.setBackgroundColorCompat(backgroundColor)

        binding.viewAuxProcedure2.setBackgroundColorCompat(backgroundColor)
        binding.viewAuxSymbols1.setBackgroundColorCompat(backgroundColor)
    }

    private fun activeButtonProcedure() {
        val backgroundColor = binding.root.context.getColorCompat(R.color.color_difficult_easy)
        binding.layoutButtonProcedure.setBackgroundColorTintCompat(backgroundColor)
        binding.viewAuxProcedure1.setBackgroundColorCompat(backgroundColor)
        binding.viewAuxProcedure2.setBackgroundColorCompat(backgroundColor)

        binding.viewAuxTop.setBackgroundColorCompat(backgroundColor)
        binding.viewAuxThemes1.setBackgroundColorCompat(backgroundColor)

    }

    private fun Context.getColorCompat(@ColorRes colorResId: Int): Int {
        return ContextCompat.getColor(this, colorResId)
    }

    private fun View.setBackgroundColorTintCompat(@ColorInt color: Int) {
        backgroundTintList = ColorStateList.valueOf(color)
    }

    private fun View.setBackgroundColorCompat(@ColorInt color: Int) {
        setBackgroundColor(color)
    }

    private fun TextView.setTextColorCompat(@ColorInt color: Int) {
        setTextColor(color)
    }
}