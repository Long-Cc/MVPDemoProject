package com.kotlin.longc.login.ui.activity

import android.os.Bundle
import android.util.Log
import com.kotlin.longc.base.ui.activity.BaseMvpActivity
import com.kotlin.longc.login.R
import com.kotlin.longc.login.injection.component.DaggerLoginComponent
import com.kotlin.longc.login.injection.module.LoginModule
import com.kotlin.longc.login.presenter.LoginPresenter
import com.kotlin.longc.login.presenter.view.LoginView
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.toast

class LoginActivity : BaseMvpActivity<LoginPresenter>(), LoginView {

    override fun onLoginResult(result: String) {
        Log.d("TAG", result)
        //toast(result)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        mLoginBtn.setOnClickListener {
            mPresenter.login()
        }
    }

    override fun injectComponent() {
        DaggerLoginComponent.builder()
                .activityComponent(mActivityComponent)
                .loginModule(LoginModule())
                .build()
                .injection(this)
        mPresenter.mView = this
    }
}
