package com.jdlstudios.programming.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.jdlstudios.programming.R
import com.jdlstudios.programming.model.TheoryAlgorithmModel

class AlgorithmTheoryAdapter(
    private val imageList: MutableList<TheoryAlgorithmModel>,
    private val viewPager2: ViewPager2
) : RecyclerView.Adapter<AlgorithmTheoryAdapter.AlgorithmTheoryViewHolder>() {

    class AlgorithmTheoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textTitle: TextView = itemView.findViewById(R.id.text_title_content)
        val textDescription: TextView = itemView.findViewById(R.id.text_title_content)
        val textTips: TextView = itemView.findViewById(R.id.text_title_content)
        val imageContent: ImageView = itemView.findViewById(R.id.image_content)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlgorithmTheoryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_theory_algorithm, parent, false)

        return AlgorithmTheoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    override fun onBindViewHolder(holder: AlgorithmTheoryViewHolder, position: Int) {
        holder.textTitle.text = imageList[position].title
        holder.textDescription.text = imageList[position].title
        holder.textTips.text = imageList[position].title
        holder.imageContent.setImageResource(imageList[position].image)

        if (position == imageList.size - 1) {
            viewPager2.post(runnable)
        }
    }

    private val runnable = Runnable {
        imageList.addAll(imageList)
        notifyDataSetChanged()
    }
}