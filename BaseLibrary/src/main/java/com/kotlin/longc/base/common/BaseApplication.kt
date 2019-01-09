package com.kotlin.longc.base.common

import android.app.Application
import android.content.Context
import com.kotlin.longc.base.injection.component.AppComponent
import com.kotlin.longc.base.injection.component.DaggerAppComponent
import com.kotlin.longc.base.injection.module.AppModule

/**
 * Created by mac on 2019/1/9.
 */
open class BaseApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        initAppInjection()
        context = this

    }

    private fun initAppInjection() {
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
    /*
       全局伴生对象
    */
    companion object {
        lateinit var context: Context
    }
}