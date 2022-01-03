package com.example.backclick

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(val list: ArrayList<Int>):RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.lyt_recycler_view, parent, false)

        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pos = position
        holder.textView.text = "item number ${list[position]}"
        holder.textView.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View) {
                openFragment(pos,p0.context)
            }

        })
    }

    private fun openFragment(position: Int,context: Context) {
        val bundle = Bundle()
        bundle.putInt("position", position)
        val fragment = LandingFragment()
        fragment.arguments = bundle
        val fragmentManager = (context as AppCompatActivity).supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.lyt_container,fragment)
        transaction.addToBackStack(LandingFragment().javaClass.simpleName)
        transaction.commit()
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val textView = itemView.findViewById<TextView>(R.id.tv_title)
}