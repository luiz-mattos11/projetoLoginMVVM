package com.example.testedatabinding.views

import android.arch.lifecycle.Observer
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.testedatabinding.R
import com.example.testedatabinding.viewModels.LoginViewModel
import com.example.testedatabinding.databinding.ActivityMainBinding
import android.arch.lifecycle.ViewModelProviders
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var model:LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        model = ViewModelProviders.of(this).get(LoginViewModel::class.java)

        binding.loginData = model

        loginField.addTextChangedListener(object : TextWatcher {
              override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {

              }

              override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

              }

              override fun afterTextChanged(s: Editable) {
                  model.loginInfo = loginField.text.toString()
              }
          })


       passwdField.addTextChangedListener(object : TextWatcher {
              override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {

              }

              override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

              }

              override fun afterTextChanged(s: Editable) {
                  model.passwdInfo = passwdField.text.toString()
              }
         })

        val isLogged = Observer<String> { creds ->
            textView.text = creds
        }

        model.credent.observe(this, isLogged)
    }
}

