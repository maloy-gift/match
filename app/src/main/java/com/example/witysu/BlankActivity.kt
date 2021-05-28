package com.example.witysu

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ListAdapter
import com.example.witysu.databinding.ActivityBlankBinding
import com.example.witysu.models.CModel

class BlankActivity : AppCompatActivity() {


    private lateinit var mBinding: ActivityBlankBinding

    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityBlankBinding.inflate(layoutInflater)
        setContentView(mBinding.root)


        listView = findViewById<ListView>(R.id.chat_view)
// 1
        val message = arrayOf<String?>("Привет","а","1","У вас симпатия")
// 2
        val name = arrayOf<String?>("Света", "Вера", "Вика")

        val photo = arrayOf<String?>("12", "23", "34", "45")
// 3


// 4
        val adapter = ArrayAdapter(this, android.R.layout.item,name)
        listView.adapter = adapter



     }


    }
