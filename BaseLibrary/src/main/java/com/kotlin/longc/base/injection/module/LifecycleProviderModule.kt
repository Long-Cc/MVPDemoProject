package com.kotlin.longc.base.injection.module

import com.trello.rxlifecycle.LifecycleProvider
import dagger.Module
import dagger.Provides

/**
 * Created by mac on 2019/1/11.
 */
@Module
class LifecycleProviderModule(private val lifecycleProvider: LifecycleProvider<*>) {
    @Provides
    fun providerLifecycleProvider(): LifecycleProvider<*> {
        return lifecycleProvider
    }
}