package com.example.backclick

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FirstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        setAdapter(view)
        return view
    }

    private fun setAdapter(view: View) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)
        val list = ArrayList<Int>()
        for(index in 0..50){
            list.add(index)
        }
        recyclerView.adapter = RecyclerViewAdapter(list)
    }


}