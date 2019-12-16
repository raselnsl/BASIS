package com.nogorsolutions.basis.ui.Initiatives


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import com.nogorsolutions.basis.R
import com.nogorsolutions.basis.databinding.FragmentOurInitiativesBinding

/**
 * A simple [Fragment] subclass.
 */
class OurInitiativesFragment : Fragment() {
    private lateinit var binding: FragmentOurInitiativesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_our_initiatives,
            container,
            false
        )
        return binding.root

    }


}
