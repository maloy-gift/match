package com.example.witysu.ui.dialogue

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
//import android.support.v7.app.AppCompatActivity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toolbar
import com.example.witysu.R
import com.example.witysu.databinding.FragmentMessageBinding

class MessageFragment : Fragment() {

    private lateinit var mBinding: FragmentMessageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentMessageBinding.inflate(layoutInflater)
        return mBinding.root
    }

    override fun onResume() {
        super.onResume()
    }

}