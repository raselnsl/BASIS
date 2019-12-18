package com.nogorsolutions.basis.ui.main_view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.nogorsolutions.basis.R
import com.nogorsolutions.basis.databinding.ItemBasisGalleryBinding

class BASISGalleryRecyclerViewAdapter() : RecyclerView.Adapter<BASISGalleryRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    )= ViewHolder(
        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_basis_gallery,
            parent,
            false
        )
    )

    override fun getItemCount(): Int = 6

    override fun onBindViewHolder(
        holder: BASISGalleryRecyclerViewAdapter.ViewHolder,
        position: Int
    ) {

    }

    class ViewHolder(
        private val binding: ItemBasisGalleryBinding
    ):RecyclerView.ViewHolder(binding.root){

    }
}