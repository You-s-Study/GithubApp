package com.sanhuzhen.lib.base

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

/**
 * description:
 * author: sanhuzhen
 * date: 2024/12/17 22:26
 */
abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    protected val binding: VB by lazy {
        getViewBinding()
    }

    abstract fun getViewBinding(): VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
    }
}