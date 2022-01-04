package com.example.backclick

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.backclick.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding:FragmentFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_first,container,false)
        setAdapter()
        return binding.root
    }

    private fun setAdapter() {
        val list = ArrayList<Int>()
        for(index in 0..50){
            list.add(index)
        }
        binding.recyclerView.adapter = RecyclerViewAdapter(list)
    }

}