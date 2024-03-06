package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentPage2Binding

class Page2Fragment : Fragment() {

    private lateinit var binding: FragmentPage2Binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentPage2Binding.inflate(inflater,container,false)
        return binding.root
    }

}