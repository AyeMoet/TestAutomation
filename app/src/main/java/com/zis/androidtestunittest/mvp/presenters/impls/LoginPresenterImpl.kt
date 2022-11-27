package com.zis.androidtestunittest.mvp.presenters.impls

import androidx.lifecycle.LifecycleOwner
import com.zis.androidtestunittest.mvp.presenters.LoginPresenter
import com.zis.androidtestunittest.mvp.views.LoginView
import com.zis.androidtestunittest.utils.EM_LOGIN_FAIL_ERROR_MESSAGE

class LoginPresenterImpl : LoginPresenter, BaseAppPresenterImpl<LoginView>() {
    override fun onUIReady(owner: LifecycleOwner) {}

    override fun onTapLogin(userName: String, password: String) {
        if(userName.isNotEmpty() || password.isNotEmpty()){
            mView.navigateToMainScreen()
        } else {
            mView.showErrorMessage(EM_LOGIN_FAIL_ERROR_MESSAGE)
        }
    }
}