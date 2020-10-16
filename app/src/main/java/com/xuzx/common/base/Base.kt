package com.xuzx.common.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.annotation.LayoutRes
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.viewbinding.ViewBinding

abstract class BaseActivity : AppCompatActivity() {
    protected abstract val layoutResId: Int
        @LayoutRes get
}

abstract class BaseDataBindingActivity<T : ViewDataBinding> : BaseActivity() {
    protected val binding: T by lazy {
        DataBindingUtil.inflate<T>(layoutInflater, layoutResId, null, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initListener()
    }

    protected abstract fun initListener()
}

abstract class BaseViewBindingActivity<T : ViewBinding> : BaseActivity() {
    /*protected val binding: T by lazy {
        DataBindingUtil.inflate<T>(layoutInflater, layoutResId, null, false)
    }*/

    lateinit var inflate: (LayoutInflater) -> T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //mBinding = T()

        //mBinding = DataBindingUtil.setContentView(this, getLayoutResId())
    }
}