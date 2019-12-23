package com.nogorsolutions.basis.ui.main_view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.nogorsolutions.basis.R
import com.nogorsolutions.basis.databinding.ItemWhatsNewBinding


class WhatsNewRecyclerViewAdapter() :
    RecyclerView.Adapter<WhatsNewRecyclerViewAdapter.ViewHolder>() {

    var image = arrayListOf(R.drawable.dutch_bangla,R.drawable.slide1,R.drawable.slide2,R.drawable.slide3,R.drawable.dutch_bangla)
    var title = arrayListOf(R.string.basis_softexpo,R.string.NASA,R.string.basis_softexpo,R.string.NASA,R.string.basis_softexpo)
    var normal = arrayListOf(R.string.basisNormal,R.string.nasaNormal,R.string.basisNormal,R.string.nasaNormal,R.string.basisNormal)
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    )=ViewHolder (
        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_whats_new,
            parent,
            false
    )
    )
    override fun getItemCount(): Int = 5

    override fun onBindViewHolder(holder: WhatsNewRecyclerViewAdapter.ViewHolder, position: Int) {

        holder.iv.setImageResource(image[position])
        holder.tvTitle.setText(title[position])
        holder.tvNormal.setText(normal[position])


    }

    class ViewHolder(
        private val binding: ItemWhatsNewBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        val iv = binding.iv
        val tvTitle = binding.tvTitle
        val tvNormal = binding.tvNormal
        val btnReadMore = binding.btnReadMore


    }

}