package com.nogorsolutions.basis.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.nogorsolutions.basis.R
import com.nogorsolutions.basis.databinding.FragHomeBinding
import com.nogorsolutions.basis.ui.home.dummy.DummyContent.DummyItem


class HomeFragment : Fragment(),HomeAdapter.HomeItemListener {


    private var isOpen: Boolean = false
    private lateinit var binding: FragHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

         binding = DataBindingUtil.inflate(
                     inflater,
                     R.layout.frag_home,
                     container,
                     false
                 )


        return binding.root
    }

    override fun HomeItemClicked(item: DummyItem?) {

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fab_close = AnimationUtils.loadAnimation(context, R.anim.fab_close)
        val fab_open = AnimationUtils.loadAnimation(context, R.anim.fab_open)
        val fab_clock = AnimationUtils.loadAnimation(context, R.anim.fab_rotate_clock)
        val fab_anticlock = AnimationUtils.loadAnimation(context, R.anim.fab_rotate_anticlock)


        binding.fab.setOnClickListener{
            isOpen = if (isOpen) {
                binding.fab1.startAnimation(fab_close)
                binding.fab2.startAnimation(fab_close)
                binding.fab3.startAnimation(fab_close)
                binding.fab.startAnimation(fab_anticlock)

                binding.fab1.setClickable(false)
                binding.fab2.setClickable(false)
                binding.fab3.setClickable(false)

                false
            } else {
                binding.fab1.startAnimation(fab_open)
                binding.fab2.startAnimation(fab_open)
                binding.fab3.startAnimation(fab_open)
                binding.fab.startAnimation(fab_clock)

                binding.fab1.setClickable(true)
                binding.fab2.setClickable(true)
                binding.fab3.setClickable(true)
                true
            }
        }
    }
}
