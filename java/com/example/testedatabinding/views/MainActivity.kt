package com.example.testedatabinding.views

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.testedatabinding.R
import com.example.testedatabinding.viewModels.LoginViewModel
import com.example.testedatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //val binding:ActivityMainBinding = ActivityMainBinding.inflate(R.layout.activity_main.)

        binding.loginData = LoginViewModel()
    }
}

