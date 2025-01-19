package com.sanhuzhen.githubapp

import com.sanhuzhen.lib.base.BaseApp

/**
 * description:
 * author: sanhuzhen
 * date: 2024/12/18 16:00
 */
class App: BaseApp() {
    override fun onCreate() {
        super.onCreate()
        appContext = this
    }
}