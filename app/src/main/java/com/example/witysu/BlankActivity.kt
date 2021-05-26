package com.example.witysu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.witysu.databinding.ActivityBlankBinding

class BlankActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityBlankBinding
    private lateinit var mToolbar: Toolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityBlankBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

    }

    override fun onStart() {
        super.onStart()
        initFunc()
    }

    private fun initFunc(){
        setSupportActionBar(mToolbar)

    }



}