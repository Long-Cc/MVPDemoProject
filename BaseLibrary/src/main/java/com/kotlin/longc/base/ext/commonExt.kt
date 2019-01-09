package com.kotlin.longc.base.ext

import com.kotlin.longc.base.rx.BaseSubscriber
import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * Created by mac on 2019/1/8.
 */
fun <T> Observable<T>.execute(subscriber: BaseSubscriber<T>) {
    this.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(subscriber)
}