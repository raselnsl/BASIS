package com.nogorsolutions.basis.ui.home

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nogorsolutions.basis.R

import com.nogorsolutions.basis.ui.home.dummy.DummyContent
import com.nogorsolutions.basis.ui.home.dummy.DummyContent.DummyItem


class HomeFragment : Fragment(),HomeAdapter.HomeItemListener {


    private var columnCount = 3

    private var listener: HomeAdapter.HomeItemListener? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.frag_home, container, false)

        // Set the adapter
        if (view is RecyclerView) {
            with(view) {
                layoutManager = when {
                    columnCount <= 1 -> LinearLayoutManager(context)
                    else -> GridLayoutManager(context, columnCount)
                }
                adapter = HomeAdapter(DummyContent.ITEMS, listener)
            }
        }
        return view
    }

    override fun HomeItemClicked(item: DummyItem?) {

    }
}
