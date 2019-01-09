package com.kotlin.longc.base.rx

import rx.Subscriber

/**
 * Created by mac on 2019/1/8.
 */
open class BaseSubscriber<T> : Subscriber<T>() {
    override fun onCompleted() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onNext(t: T) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError(e: Throwable?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}