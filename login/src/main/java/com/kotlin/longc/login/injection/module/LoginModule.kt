package com.kotlin.longc.login.injection.module

import com.kotlin.longc.login.service.LoginService
import com.kotlin.longc.login.service.impl.LoginServiceImpl
import dagger.Module
import dagger.Provides

/**
 * Created by mac on 2019/1/11.
 */
@Module
class LoginModule {
    @Provides
    fun providerLoginService(loginService: LoginServiceImpl):LoginService{
        return loginService
    }
}