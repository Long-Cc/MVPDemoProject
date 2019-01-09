package com.kotlin.longc.base.injection.scope

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Scope

/**
 * Created by mac on 2019/1/10.
 */
/*
    组件级别 作用域
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
annotation class PerComponentScope {
}