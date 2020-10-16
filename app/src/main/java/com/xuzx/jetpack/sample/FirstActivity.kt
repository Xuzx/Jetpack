package com.xuzx.jetpack.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.library.baseAdapters.DataBinderMapperImpl
import com.xuzx.jetpack.sample.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityFirstBinding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView
    }
}