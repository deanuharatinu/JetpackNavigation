package com.example.jetpacknavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavArgs
import androidx.navigation.NavController
import com.example.jetpacknavigation.databinding.ThirdFragmentBinding

class ThirdFragment : Fragment() {
    private var _binding: ThirdFragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ThirdFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var title: String = ""
        arguments?.let {
            val safeArgs = ThirdFragmentArgs.fromBundle(it)
            title = safeArgs.text
        }

        if (!title.isEmpty())
            binding.tvThirdFragmentTitle.text = title
        else
            binding.tvThirdFragmentTitle.text = "Empty text"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}