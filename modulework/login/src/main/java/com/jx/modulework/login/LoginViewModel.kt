package com.jx.modulework.login

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    val userName = MutableLiveData<String>()
    val password = MutableLiveData<String>()

    fun login() {
        userName.value = ""
        password.value = ""
        Log.d("123", "${userName.value}  ${password.value}  ")
    }
}