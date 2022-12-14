package com.leandrohc.codelabudacity.apps

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.leandrohc.codelabudacity.R
import com.leandrohc.codelabudacity.databinding.FragmentColorMyViewsBinding
import kotlinx.android.synthetic.main.fragment_color_my_views.*

class ColorMyViews : Fragment(R.layout.fragment_color_my_views) {

    private var binding: FragmentColorMyViewsBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentColorMyViewsBinding.bind(view)
        setListeners()

    }

//    private fun makeDesColored(view: View) {
//        when (view.id) {
//
//            // Boxes using Color class colors for background
//            R.id.box_one_text -> view.setBackgroundColor(Color.WHITE)
//            R.id.box_two_text -> view.setBackgroundColor(Color.WHITE)
//
//            // Boxes using Android color resources for background
//            R.id.box_three_text -> view.setBackgroundColor(Color.WHITE)
//            R.id.box_four_text -> view.setBackgroundColor(Color.WHITE)
//            R.id.box_five_text -> view.setBackgroundColor(Color.WHITE)
//
//            R.id.red_button -> box_three_text.setBackgroundColor(Color.WHITE)
//            R.id.yellow_button -> box_four_text.setBackgroundColor(Color.WHITE)
//            R.id.green_button -> box_five_text.setBackgroundColor(Color.WHITE)
//
//            else -> view.setBackgroundColor(Color.WHITE)
//        }
//    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(
                box_one_text, box_two_text, box_three_text,
                box_four_text, box_five_text, constraint_layout,
                red_button, yellow_button, green_button
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}