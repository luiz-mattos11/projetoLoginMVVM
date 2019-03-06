package com.example.testedatabinding.models

data class UserData(var username:String, var passwd:String) {
    fun verifyCredentials():Boolean{
        return getUser() == "admin" && getPass() == "admin"
    }

    fun getUser():String{
        return username
    }

    fun getPass():String{
        return passwd
    }

    fun setUser(username:String){
        this.username = username
    }

    fun setPass(passwd: String){
        this.passwd = passwd
    }
}