package com.example.backclick

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class LandingFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_landing, container, false)
        val textView = view.findViewById<TextView>(R.id.tv_land)
        arguments?.let {
            val pos = it.getInt("position",0)
            textView.text = "called from position $pos"
        }

        return view
    }
}