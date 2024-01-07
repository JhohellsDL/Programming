package com.jdlstudios.programming.ui.views

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.jdlstudios.programming.data.DataSourceTheoryAlgoritm
import com.jdlstudios.programming.databinding.FragmentAlgorithmTheoryBinding
import com.jdlstudios.programming.model.TheoryAlgorithmModel
import com.jdlstudios.programming.ui.adapter.AlgorithmTheoryAdapter
import com.jdlstudios.programming.util.TIME_IN_MILLIS_TRANSITION
import kotlin.math.abs

class AlgorithmTheoryFragment : Fragment() {
    private lateinit var binding: FragmentAlgorithmTheoryBinding

    private lateinit var handler: Handler
    private lateinit var listt: MutableList<TheoryAlgorithmModel>
    private lateinit var adapter: AlgorithmTheoryAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAlgorithmTheoryBinding.inflate(inflater)

        init()
        setUpTransformer()

        binding.viewpagerTheoryAlgorithm.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                handler.removeCallbacks(runnable)
                handler.postDelayed(runnable, TIME_IN_MILLIS_TRANSITION.toLong())
            }
        })

        return binding.root
    }

    override fun onPause() {
        super.onPause()
        handler.removeCallbacks(runnable)
    }

    override fun onResume() {
        super.onResume()
        handler.postDelayed(runnable, TIME_IN_MILLIS_TRANSITION.toLong())
    }

    private val runnable = Runnable {
        binding.viewpagerTheoryAlgorithm.currentItem =
            binding.viewpagerTheoryAlgorithm.currentItem + 1
    }

    private fun setUpTransformer() {
        val transformer = CompositePageTransformer()
        transformer.addTransformer(MarginPageTransformer(40))
        transformer.addTransformer { page, position ->
            val r = 1 - abs(position)
            page.scaleY = 0.85f + r * 0.14f
        }

        binding.viewpagerTheoryAlgorithm.setPageTransformer(transformer)
    }

    private fun init() {
        binding.viewpagerTheoryAlgorithm
        handler = Handler(Looper.myLooper()!!)
        listt = DataSourceTheoryAlgoritm.theoryAlgorithmList

        adapter = AlgorithmTheoryAdapter(listt, binding.viewpagerTheoryAlgorithm)

        binding.viewpagerTheoryAlgorithm.adapter = adapter
        binding.viewpagerTheoryAlgorithm.offscreenPageLimit = 3
        binding.viewpagerTheoryAlgorithm.clipToPadding = false
        binding.viewpagerTheoryAlgorithm.clipChildren = false

        binding.viewpagerTheoryAlgorithm.getChildAt(0).overScrollMode =
            RecyclerView.OVER_SCROLL_NEVER
    }

}