package com.example.jetpacknavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.jetpacknavigation.databinding.WelcomeFragmentBinding

class WelcomeFragment : Fragment() {
    /** This is how to use and make view binding in kotlin fragment
     * @author Deanu H.T. - 3 April 2022
     */
    private var _binding: WelcomeFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = WelcomeFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    /**
     * Fragments outlive their views. Make sure you clean up any references to the binding class
     * instance in the fragment's onDestroyView() method.
     * @author: Deanu H.T. - 3 April 2022
     */
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}