package com.v1bottoni.jetpackapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.v1bottoni.jetpackapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToSecondFragment(binding.editText.text.toString())
            findNavController().navigate(action)
        }

        binding.buttonVm.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToEsempioVMFragment()
            findNavController().navigate(action)
        }
    }

}