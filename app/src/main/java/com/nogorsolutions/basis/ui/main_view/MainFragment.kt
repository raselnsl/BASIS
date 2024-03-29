package com.nogorsolutions.basis.ui.main_view

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController

import com.nogorsolutions.basis.R
import com.nogorsolutions.basis.databinding.FragMainBinding

class MainFragment : Fragment() {

    lateinit var imageAnimation: Animation
    lateinit var textAnimatin: Animation
    lateinit var animation1: Animation
    lateinit var animation2: Animation
    lateinit var animation3: Animation
    lateinit var animation4: Animation
    lateinit var animation5: Animation
    lateinit var animation6: Animation
    lateinit var buttonAnimation: Animation


    private lateinit var binding: FragMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

         binding = DataBindingUtil.inflate(
                     inflater,
                     R.layout.frag_main,
                     container,
                     false
                 )

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        val images = intArrayOf(
            R.drawable.slide1,
            R.drawable.slide2,
            R.drawable.slide3
        )
        for (i in images.indices) {
            flipperImages(images[i])
        }

        //marquee set
        //tvCESC.isSelected = true

        // declare the Animation
        imageAnimation = AnimationUtils.loadAnimation(context, R.anim.image_animation)
        textAnimatin = AnimationUtils.loadAnimation(context, R.anim.text_animation)
        animation1 = AnimationUtils.loadAnimation(context, R.anim.card_animation)
        animation2 = AnimationUtils.loadAnimation(context, R.anim.card_animation2)
        animation3 = AnimationUtils.loadAnimation(context, R.anim.card_animation3)
        animation4 = AnimationUtils.loadAnimation(context, R.anim.card_animation4)
        animation5 = AnimationUtils.loadAnimation(context, R.anim.card_animation5)
        animation6 = AnimationUtils.loadAnimation(context, R.anim.card_animation6)
        buttonAnimation = AnimationUtils.loadAnimation(context, R.anim.button_animation)

    }

    fun flipperImages(image: Int) {
        val imageView = ImageView(context)
        imageView.scaleType = ImageView.ScaleType.CENTER_CROP
        imageView.setBackgroundResource(image)
        binding.viewFlipper?.addView(imageView)
        binding.viewFlipper?.setFlipInterval(4000)
        binding.viewFlipper?.setAutoStart(true)
        //animation
        binding.viewFlipper?.setInAnimation(context, android.R.anim.slide_in_left)
        binding.viewFlipper?.setOutAnimation(context, android.R.anim.slide_out_right)
    }


    // set Animation
    override fun onResume() {
        super.onResume()
        binding.circleImageView.startAnimation(imageAnimation)
        binding.tvCESC.startAnimation(textAnimatin)
        binding.cvAboutUs.startAnimation(animation1)
        binding.cvAdmission.startAnimation(animation2)
        binding.cvAcademic.startAnimation(animation3)
        binding.cvGallery.startAnimation(animation4)
        binding.cvNotice.startAnimation(animation5)
        binding.cvContactUs.startAnimation(animation6)
        binding.btnLogIn.startAnimation(buttonAnimation)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnLogIn.setOnClickListener {
            findNavController().navigate(R.id.nav_login)
        }

        binding.cvAboutUs.setOnClickListener {
            findNavController().navigate(R.id.nav_about_us)
        }
    }

}
