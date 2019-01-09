package com.kotlin.longc.base.injection.module

import android.app.Activity
import com.kotlin.longc.base.injection.scope.ActivityScope
import dagger.Module
import dagger.Provides

/**
 * Created by mac on 2019/1/10.
 */
@Module
class ActivityModule(private val activity: Activity) {
    @ActivityScope
    @Provides
    fun provideActivity(): Activity {
        return this.activity
    }
}