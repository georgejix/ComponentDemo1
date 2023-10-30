package com.jx.modulework.login

import android.database.Observable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.jx.modulework.login.databinding.ActivityLoginBinding

@Route(path = "/login/LoginActivity")
class LoginActivity : AppCompatActivity() {
    lateinit var mLoginVm: LoginViewModel
    lateinit var mBinding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        ARouter.getInstance().inject(this)

        mLoginVm = ViewModelProviders.of(this).get(LoginViewModel::class.java)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        mBinding.vm = mLoginVm
        mBinding.lifecycleOwner = this

        mLoginVm.password.observe(this) { v ->
            Log.d("123", "$v")
        }
    }
}