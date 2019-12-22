package com.nogorsolutions.basis.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController

import com.nogorsolutions.basis.R
import com.nogorsolutions.basis.databinding.FragmentCompanyInformBinding

/**
 * A simple [Fragment] subclass.
 */
class CompanyInformFragment : Fragment() {
    private lateinit var binding: FragmentCompanyInformBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_company_inform,
            container,
            false
        )
        binding.btnSaveandCotinuetoStep.setOnClickListener {
            findNavController().navigate(R.id.nav_payment_information)
        }
        return binding.root
    }


}
