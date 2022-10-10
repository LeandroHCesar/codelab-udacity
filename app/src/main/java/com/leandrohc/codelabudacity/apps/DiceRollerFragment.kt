package com.leandrohc.codelabudacity.apps

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.leandrohc.codelabudacity.R
import com.leandrohc.codelabudacity.databinding.FragmentDiceRolerBinding
import java.util.*

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class DiceRollerFragment : Fragment(R.layout.fragment_dice_roler) {

    private var _binding: FragmentDiceRolerBinding? = null
    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentDiceRolerBinding.bind(view)

        _binding!!.rollButton.text = getString(R.string.text_button)

        _binding!!.rollButton.setOnClickListener {
            rollDice()
            //findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1

        val diceImage = _binding?.diceImage

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage?.setImageResource(drawableResource)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}