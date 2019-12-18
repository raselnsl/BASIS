package com.nogorsolutions.basis.ui.registration


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import com.nogorsolutions.basis.R
import com.nogorsolutions.basis.databinding.FragmentRegistrationBinding


class RegistrationFragment : Fragment() {

    private lateinit var binding: FragmentRegistrationBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


       binding = DataBindingUtil.inflate(
           inflater,
           R.layout.fragment_registration,
           container,
           false
       )
       return binding.root
    }


}
