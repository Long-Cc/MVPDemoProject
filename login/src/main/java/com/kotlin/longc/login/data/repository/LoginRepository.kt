package com.kotlin.longc.login.data.repository

import com.kotlin.longc.base.data.net.RetrofitFactory
import com.kotlin.longc.base.data.protocol.BaseResp
import com.kotlin.longc.login.data.api.LoginApi
import com.kotlin.longc.login.data.protocol.LoginResp
import rx.Observable
import javax.inject.Inject

/**
 * Created by mac on 2019/1/8.
 */
class LoginRepository @Inject constructor() {
    fun getLoginInfo(): Observable<BaseResp<List<LoginResp>>> {
        return RetrofitFactory.instance.create(LoginApi::class.java)
                .getLoginInfo()
    }
}