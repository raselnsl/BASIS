package com.nogorsolutions.basis.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController

import com.nogorsolutions.basis.R
import com.nogorsolutions.basis.databinding.FragmentOtpvalidationBinding

/**
 * A simple [Fragment] subclass.
 */
class OTPValidationFragment : Fragment() {
    private lateinit var binding: FragmentOtpvalidationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_otpvalidation,
            container,
            false
        )
        binding.btnSend.setOnClickListener {
            findNavController().navigate(R.id.nav_company_information)
        }
        return binding.root
    }


}
