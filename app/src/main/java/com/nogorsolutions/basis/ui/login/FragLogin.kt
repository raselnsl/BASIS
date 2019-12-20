package com.nogorsolutions.basis.ui.login


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.nogorsolutions.basis.MainActivity

import com.nogorsolutions.basis.R
import com.nogorsolutions.basis.databinding.FragLoginBinding
import com.nogorsolutions.basis.ui.DashboardActivity


class FragLogin : Fragment() {

    private lateinit var binding: FragLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.frag_login,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnLogIn.setOnClickListener {
           /* findNavController().navigate(R.id.nav_home)*/
          val intent = Intent(context, DashboardActivity::class.java)
            startActivity(intent)
        }

        binding.btnGoToSignUp.setOnClickListener {
            findNavController().navigate(R.id.nav_signup)
        }
    }
}
