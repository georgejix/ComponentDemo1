package com.jx.modulework.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter

@Route(path = "/main/MainActivity")
class MainActivity : AppCompatActivity() {
    @JvmField
    @Autowired
    var value1: Int = 0

    @JvmField
    @Autowired(name = "value2")
    var value2_: Boolean = true

    companion object {
        val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ARouter.getInstance().inject(this)
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "value1 = ${value1} value2= ${value2_}")
    }
}