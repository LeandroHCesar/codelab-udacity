package com.leandrohc.codelabudacity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.leandrohc.codelabudacity.databinding.FragmentMainBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class MainFragment : Fragment(R.layout.fragment_main) {

    private var _binding: FragmentMainBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)

        _binding!!.buttonDiceRoller.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_SecondFragment)
        }
        _binding!!.buttonAboutMe.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_aboutMeFragment)
        }
        _binding!!.buttonColorMyViews.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_colorMyViews)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}