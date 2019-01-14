package com.kotlin.longc.login.presenter

import com.kotlin.longc.base.ext.execute
import com.kotlin.longc.base.presenter.BasePresenter
import com.kotlin.longc.base.rx.BaseSubscriber
import com.kotlin.longc.login.data.protocol.LoginResp
import com.kotlin.longc.login.presenter.view.LoginView
import com.kotlin.longc.login.service.LoginService
import com.kotlin.longc.login.service.impl.LoginServiceImpl
import com.trello.rxlifecycle.android.ActivityEvent
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by mac on 2019/1/7.
 */
class LoginPresenter @Inject constructor() : BasePresenter<LoginView>() {
    /*
        业务逻辑
     */
    @Inject
    lateinit var loginService:LoginService
    fun login() {
        //mView.onLoginResult("45")
//        loginService.getLogin()
//                .execute(object : BaseSubscriber<List<LoginResp>>() {
//                    override fun onNext(t: List<LoginResp>) {
//                        mView.onLoginResult(t[3].title)
//                    }
//                }, lifecycleProvider)
        loginService.getLogin()
                .compose(lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe {
                    mView.onLoginResult(it[3].title)
                }


    }
}