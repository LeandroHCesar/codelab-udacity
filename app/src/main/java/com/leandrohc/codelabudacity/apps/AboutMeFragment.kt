package com.leandrohc.codelabudacity.apps

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import com.leandrohc.codelabudacity.MyName
import com.leandrohc.codelabudacity.R
import com.leandrohc.codelabudacity.databinding.FragmentAboutMeBinding

class AboutMeFragment : Fragment(R.layout.fragment_about_me) {

    private lateinit var _binding: FragmentAboutMeBinding

    private val myName: MyName = MyName("Leandro Henrique")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentAboutMeBinding.bind(view)
        _binding.myName = myName

        _binding.buttonDone.setOnClickListener { addNickName(it) }
    }

    private fun addNickName(view: View) {
        _binding.apply {

            myName?.nickname = nicknameEdit.text.toString()
            invalidateAll()
            _binding.nicknameEdit.visibility = View.GONE
            _binding.buttonDone.visibility = View.GONE
            _binding.nicknameText.visibility = View.VISIBLE
        }
        //val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        //imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}