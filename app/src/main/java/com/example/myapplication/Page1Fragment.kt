package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentPage1Binding

class Page1Fragment : Fragment() {

    private lateinit var binding: FragmentPage1Binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentPage1Binding.inflate(inflater,container,false)
        return binding.root
    }

}