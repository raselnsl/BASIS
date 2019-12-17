package com.nogorsolutions.basis.ui.main_view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.nogorsolutions.basis.R
import com.nogorsolutions.basis.databinding.ItemWhatsNewBinding
import java.util.zip.Inflater

class WhatsNewRecyclerViewAdapter() :
    RecyclerView.Adapter<WhatsNewRecyclerViewAdapter.ViewHolder>() {

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