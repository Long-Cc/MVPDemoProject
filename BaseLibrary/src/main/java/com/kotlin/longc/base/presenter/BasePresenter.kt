package com.kotlin.longc.base.presenter

import com.kotlin.longc.base.presenter.view.BaseView

/**
 * Created by mac on 2019/1/7.
 */
open class BasePresenter<T : BaseView> {
    lateinit var mView: T
}