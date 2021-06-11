package com.example.themae

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListAdapter (val context: Context, val UserList: ArrayList<User>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view: View = LayoutInflater.from(context).inflate(R.layout.item_user, null)
        val Id = view.findViewById<TextView>(R.id.textViewID)
        val Username = view.findViewById<TextView>(R.id.textViewUser)
        val Title = view.findViewById<TextView>(R.id.textViewTitle)
        val Time = view.findViewById<TextView>(R.id.textViewTime)
        val Liked = view.findViewById<TextView>(R.id.textViewLiked)


        val user = UserList[position]
        Id.text = user.id.toString()
        Username.text = user.username
        Title.text = user.title
        Time.text = user.datetime
        Liked.text = user.like.toString()

        return view
    }

    override fun getItem(position: Int): Any {
        return UserList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return UserList.size
    }
}