package com.kotlin.longc.base.injection.module

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by mac on 2019/1/9.
 */
@Module
class AppModule(private val context: Context) {
    @Singleton
    @Provides
    fun providerContext(): Context {
        return this.context
    }
}