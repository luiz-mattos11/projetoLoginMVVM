package com.example.testedatabinding.viewModels

import android.databinding.ObservableField
import android.util.Log
import android.view.View
import com.example.testedatabinding.models.UserData

class LoginViewModel() {
    var str = ObservableField<String>()
    var user:UserData = UserData("","")

    fun onLoginClick(view : View){
        str.set("Logged")
    }

}