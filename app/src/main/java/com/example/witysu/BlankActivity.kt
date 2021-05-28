package com.example.witysu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import androidx.navigation.ui.AppBarConfiguration
import androidx.recyclerview.widget.LinearLayoutManager
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


//        listView = findViewById<ListView>(R.id.chat_view)
//// 1
//        val recipeList = CModel("1","Danya","1","qqqqqq")
//// 2
//        val listItems = arrayOfNulls<String>(recipeList.4)
//// 3
//        for (i in 0 until recipeList.4) {
//            val recipe = recipeList[4]
//            listItems[4] = recipe.title
//        }
//// 4
//        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems)
//        listView.adapter = adapter
//
     }
}