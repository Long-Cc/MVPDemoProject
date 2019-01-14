package com.kotlin.longc.base.presenter

import android.content.Context
import com.kotlin.longc.base.presenter.view.BaseView
import com.trello.rxlifecycle.LifecycleProvider
import com.trello.rxlifecycle.android.ActivityEvent
import javax.inject.Inject

/**
 * Created by mac on 2019/1/7.
 */
open class BasePresenter<T : BaseView> {
    lateinit var mView: T
    //Dagger注入，Rx生命周期管理
    @Inject
    lateinit var lifecycleProvider: LifecycleProvider<ActivityEvent>

    @Inject
    lateinit var context: Context
}