package com.xuzx.jetpack.sample

import android.content.Intent
import com.xuzx.common.base.BaseDataBindingActivity
import com.xuzx.jetpack.sample.databinding.ActivityMainBinding

class MainActivity : BaseDataBindingActivity<ActivityMainBinding>() {

    override val layoutResId: Int
        get() = R.layout.activity_main

    override fun initListener() {
        binding.textView.setOnClickListener{
            startActivity(Intent(this, FirstActivity::class.java))
        }
    }
}
