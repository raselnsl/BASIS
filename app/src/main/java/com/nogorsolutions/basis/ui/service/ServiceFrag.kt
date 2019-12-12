package com.nogorsolutions.basis.ui.service

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.nogorsolutions.basis.R

class ServiceFrag : Fragment() {

    companion object {
        fun newInstance() = ServiceFrag()
    }

    private lateinit var viewModel: ServiceViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frag_service, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ServiceViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
