package com.example.jetpacknavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.jetpacknavigation.databinding.WelcomeFragmentBinding

class WelcomeFragment : Fragment() {
    /** This is how to use and make view binding in kotlin fragment
     * @author Deanu H.T. - 3 April 2022
     */
    private var _binding: WelcomeFragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = WelcomeFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = NavHostFragment.findNavController(this)

        binding.btnNextFragment.setOnClickListener {
            val toSecondFragment = WelcomeFragmentDirections.actionWelcomeFragmentToSecondFragment()
            /**
             * This checking is necessary to make sure the current destination is not null
             * @author: Deanu H.T. - 3 April 2022
             */
            if (R.id.welcomeFragment == navController.currentDestination?.id)
                navController.navigate(toSecondFragment)
        }
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