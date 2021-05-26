package com.example.witysu.ui.dialogue


import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.witysu.R


class DialogueFragment : Fragment() {


    fun onCreate(){
        findNavController().navigate(R.id.action_dialogueFragment_to_blankActivity)
    }
}