package com.kotlin.longc.login.service

import com.kotlin.longc.login.data.protocol.LoginResp
import rx.Observable

/**
 * Created by mac on 2019/1/8.
 */
interface LoginService {
    fun getLogin():Observable<List<LoginResp>>
}