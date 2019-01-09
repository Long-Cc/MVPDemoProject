package com.kotlin.longc.login.presenter

import com.kotlin.longc.base.ext.execute
import com.kotlin.longc.base.presenter.BasePresenter
import com.kotlin.longc.base.rx.BaseSubscriber
import com.kotlin.longc.login.data.protocol.LoginResp
import com.kotlin.longc.login.presenter.view.LoginView
import com.kotlin.longc.login.service.impl.LoginServiceImpl

/**
 * Created by mac on 2019/1/7.
 */
class LoginPresenter : BasePresenter<LoginView>() {
    /*
        业务逻辑
     */

    val loginService = LoginServiceImpl()
    fun login() {
        loginService.getLogin()
                .execute(object : BaseSubscriber<List<LoginResp>>() {
                    override fun onNext(t: List<LoginResp>) {
                        mView.onLoginResult(t[1].title)
                    }
                })


    }
}