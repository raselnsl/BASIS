package com.nogorsolutions.basis.ui.resources

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
import androidx.navigation.fragment.findNavController
import com.nogorsolutions.basis.R
import com.nogorsolutions.basis.databinding.FragResourcesBinding

class ResourcesFragment : Fragment() {

    private lateinit var binding: FragResourcesBinding
    private lateinit var resourcesViewModel: ResourcesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.frag_resources, container, false)

        resourcesViewModel = ViewModelProvider(this).get(ResourcesViewModel::class.java)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.cardView1.setOnClickListener {
            findNavController().navigate(R.id.nav_about_bangladesh_ictsector)
        }
    }
}