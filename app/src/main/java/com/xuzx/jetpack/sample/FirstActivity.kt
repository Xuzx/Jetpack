package com.xuzx.jetpack.sample

import android.view.LayoutInflater
import com.xuzx.common.base.BaseViewBindingActivity
import com.xuzx.jetpack.sample.databinding.ActivityFirstBinding

class FirstActivity : BaseViewBindingActivity<ActivityFirstBinding>() {

    override val inflate: (LayoutInflater) -> ActivityFirstBinding
        get() = ActivityFirstBinding::inflate
}