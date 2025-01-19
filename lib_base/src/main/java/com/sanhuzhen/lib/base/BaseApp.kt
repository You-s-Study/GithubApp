package com.sanhuzhen.lib.base

import android.app.Application
import android.content.Context

/**
 * description:
 * author: sanhuzhen
 * date: 2024/12/18 15:59
 */
open class BaseApp: Application() {
    companion object {
        lateinit var appContext: Context
    }
    override fun onCreate() {
        super.onCreate()
        appContext = this
    }
}