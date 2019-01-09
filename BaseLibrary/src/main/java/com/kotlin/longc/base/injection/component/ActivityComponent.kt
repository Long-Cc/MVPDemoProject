package com.kotlin.longc.base.injection.component

import android.app.Activity
import android.content.Context
import com.kotlin.longc.base.injection.module.ActivityModule
import com.kotlin.longc.base.injection.scope.ActivityScope
import dagger.Component

/**
 * Created by mac on 2019/1/10.
 */
@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun activity(): Activity
    fun context(): Context
}