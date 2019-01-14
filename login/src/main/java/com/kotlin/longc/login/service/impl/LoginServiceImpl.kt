package com.kotlin.longc.login.service.impl

import com.kotlin.longc.base.data.protocol.BaseResp
import com.kotlin.longc.login.data.protocol.LoginResp
import com.kotlin.longc.login.data.repository.LoginRepository
import com.kotlin.longc.login.service.LoginService
import rx.Observable
import rx.functions.Func1
import javax.inject.Inject

/**
 * Created by mac on 2019/1/8.
 */
class LoginServiceImpl @Inject constructor() : LoginService{
    @Inject
    lateinit var repository:LoginRepository
    override fun getLogin(): Observable<List<LoginResp>> {
        return repository.getLoginInfo()
                .flatMap { t ->
                    if (!t.error) {
                        Observable.just(t.results)
                    } else {
                        Observable.error(Exception("未获取数据"))
                    }
                }
    }
}