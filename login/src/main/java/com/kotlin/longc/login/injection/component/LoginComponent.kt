package com.kotlin.longc.login.injection.component

import android.app.Activity
import com.kotlin.longc.base.injection.component.ActivityComponent
import com.kotlin.longc.base.injection.scope.PerComponentScope
import com.kotlin.longc.base.ui.activity.BaseMvpActivity
import com.kotlin.longc.login.injection.module.LoginModule
import com.kotlin.longc.login.ui.activity.LoginActivity
import dagger.Component

/**
 * Created by mac on 2019/1/11.
 */
@PerComponentScope
@Component(dependencies = [ActivityComponent::class], modules = [(LoginModule::class)])
interface LoginComponent {
    fun injection(activity: LoginActivity)
}