package com.example.controlacess

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.controlacess.databinding.ActivityDashBinding

class DashActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}