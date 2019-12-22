package com.nogorsolutions.basis.ui


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import com.nogorsolutions.basis.R
import com.nogorsolutions.basis.databinding.FragmentPaymentInformationBinding

/**
 * A simple [Fragment] subclass.
 */
class PaymentInformationFragment : Fragment() {

    private lateinit var binding: FragmentPaymentInformationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_payment_information,
            container,
            false
        )

        binding.btnSave.setOnClickListener {
            startActivity(Intent(context,DashboardActivity::class.java))
        }
        return binding.root

    }


}
