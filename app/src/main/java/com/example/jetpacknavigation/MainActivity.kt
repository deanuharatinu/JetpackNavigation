package com.example.jetpacknavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jetpacknavigation.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {
    /** This is how to use and make view binding in kotlin activity
     * @author Deanu H.T. - 3 April 2022
     */
    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}