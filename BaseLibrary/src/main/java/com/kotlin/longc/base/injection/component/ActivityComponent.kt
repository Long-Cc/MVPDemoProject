package com.kotlin.longc.base.injection.component

import android.app.Activity
import android.content.Context
import com.kotlin.longc.base.injection.module.ActivityModule
import com.kotlin.longc.base.injection.module.LifecycleProviderModule
import com.kotlin.longc.base.injection.scope.ActivityScope
import com.trello.rxlifecycle.LifecycleProvider
import com.trello.rxlifecycle.android.ActivityEvent
import dagger.Component

/**
 * Created by mac on 2019/1/10.
 */
@ActivityScope
@Component(dependencies = [(AppComponent::class)], modules = [(ActivityModule::class), (LifecycleProviderModule::class)])
interface ActivityComponent {
    fun activity(): Activity
    fun context(): Context
    fun lifecycleProvider(): LifecycleProvider<ActivityEvent>
}