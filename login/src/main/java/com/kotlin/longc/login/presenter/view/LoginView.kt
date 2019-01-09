package com.kotlin.longc.login.presenter.view

import com.kotlin.longc.base.presenter.view.BaseView

/**
 * Created by mac on 2019/1/7.
 */
interface LoginView : BaseView {
    fun onLoginResult(result:String)
}