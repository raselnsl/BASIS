package com.nogorsolutions.basis.ui.membership

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.nogorsolutions.basis.R

class MemberShipFragment : Fragment() {

    private lateinit var memberShipViewModel: MemberShipViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        memberShipViewModel =
            ViewModelProviders.of(this).get(MemberShipViewModel::class.java)
        val root = inflater.inflate(R.layout.frag_membership, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)

        memberShipViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}