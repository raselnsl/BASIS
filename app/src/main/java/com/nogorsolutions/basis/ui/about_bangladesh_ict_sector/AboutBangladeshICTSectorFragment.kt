package com.nogorsolutions.basis.ui.about_bangladesh_ict_sector

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.nogorsolutions.basis.R

class AboutBangladeshICTSectorFragment : Fragment() {

    companion object {
        fun newInstance() = AboutBangladeshICTSectorFragment()
    }

    private lateinit var viewModel: AboutBangladeshIctsectorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frag_about_bangladesh_ictsector, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AboutBangladeshIctsectorViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
