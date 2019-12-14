package com.nogorsolutions.basis.ui.about

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.nogorsolutions.basis.R
import com.nogorsolutions.basis.databinding.FragAbout2Binding
import com.nogorsolutions.basis.databinding.FragAboutBinding

class AboutFragment : Fragment() {

    private lateinit var binding: FragAbout2Binding
    private lateinit var aboutViewModel: AboutViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

         binding = DataBindingUtil.inflate(
                     inflater,
                     R.layout.frag_about2,
                     container,
                     false
                 )

        aboutViewModel = ViewModelProvider(this).get(AboutViewModel::class.java)


        val root = inflater.inflate(R.layout.frag_about, container, false)


        aboutViewModel.text.observe(this, Observer {
           // textView.text = it
        })
        return binding.root


    }
}