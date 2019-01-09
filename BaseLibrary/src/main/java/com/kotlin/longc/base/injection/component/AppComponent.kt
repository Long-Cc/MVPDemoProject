package com.kotlin.longc.base.injection.component

import android.content.Context
import com.kotlin.longc.base.injection.module.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by mac on 2019/1/9.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun context():Context
}