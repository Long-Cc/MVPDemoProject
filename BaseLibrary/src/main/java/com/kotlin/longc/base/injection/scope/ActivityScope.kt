package com.kotlin.longc.base.injection.scope

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Scope

/*
    Activity级别 作用域
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
annotation class ActivityScope