package com.jx.componentdemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.launcher.ARouter

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        ARouter.getInstance().build("/main/MainActivity")
            .withInt("value1", 111)
            .withBoolean("value2", false)
            .navigation()
    }
}