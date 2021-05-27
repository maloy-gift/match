package com.example.witysu.ui.dialogue

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.witysu.R


class DialogueFragment : Fragment(R.layout.fragment_dialogue) {
    private lateinit var mRecyclerView: RecyclerView

    fun onCreate(){
        findNavController().navigate(R.id.action_dialogueFragment_to_blankActivity)
    }
}