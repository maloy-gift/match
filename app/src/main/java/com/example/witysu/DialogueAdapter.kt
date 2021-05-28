package com.example.witysu

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView



class DialogueAdapter(
                      private val imageId: String,
                      private val usersList: List <String>,
                      private val messagesList : String):RecyclerView.Adapter<DialogueAdapter.MessageHolder>() {
    class MessageHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var usersList: TextView? = null
        var messagesList: TextView? = null

        var imageId: TextView? = null
        init {
            usersList = itemView.findViewById(R.id.main_list_item_name)
            messagesList = itemView.findViewById(R.id.main_list_last_message)
            imageId = itemView.findViewById(R.id.main_list_item_photo)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.chat_item, parent, false)
        return MessageHolder(itemView)
    }

    override fun onBindViewHolder(holder: MessageHolder, position: Int) {
        holder.usersList?.text = usersList[position]
        holder.messagesList?.text = "кот"
        holder.imageId?.text = "c_profile"
    }


        override fun getItemCount() = usersList.size

}
