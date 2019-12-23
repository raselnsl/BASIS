package com.nogorsolutions.basis.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import com.nogorsolutions.basis.R
import com.nogorsolutions.basis.databinding.FragmentContactBinding

/**
 * A simple [Fragment] subclass.
 */
class ContactFragment : Fragment() {

    private lateinit var binding: FragmentContactBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = DataBindingUtil.inflate(
           inflater,
           R.layout.fragment_contact,
           container,
           false
       )
        return binding.root
    }
}
