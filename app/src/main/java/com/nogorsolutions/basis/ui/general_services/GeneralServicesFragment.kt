package com.nogorsolutions.basis.ui.general_services

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.nogorsolutions.basis.R

class GeneralServicesFragment : Fragment() {

    companion object {
        fun newInstance() = GeneralServicesFragment()
    }

    private lateinit var viewModel: GeneralServicesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frag_general_services, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(GeneralServicesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
