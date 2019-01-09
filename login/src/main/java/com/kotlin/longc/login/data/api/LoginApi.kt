package com.kotlin.longc.login.data.api

import com.kotlin.longc.base.data.protocol.BaseResp
import com.kotlin.longc.login.data.protocol.LoginResp
import retrofit2.http.GET
import rx.Observable

/**
 * Created by mac on 2019/1/8.
 */
interface LoginApi {
    @GET("api/xiandu/category/wow")
    fun getLoginInfo():Observable<BaseResp<List<LoginResp>>>
}