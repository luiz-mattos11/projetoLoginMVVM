package com.example.testedatabinding.viewModels

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField
import android.util.Log
import android.view.View
import com.example.testedatabinding.models.UserData

class LoginViewModel: ViewModel() {
    var loginInfo:String = ""
    var passwdInfo:String = ""

    val credent:MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    var user:UserData = UserData("","")


    fun onLoginClick(v : View){
        user.setUser(loginInfo)
        user.setPass(passwdInfo)

        if(user.verifyCredentials()){
            credent.value = "Logado com sucesso"
        } else credent.value = "Usuario ou senha incorretos"
    }

}