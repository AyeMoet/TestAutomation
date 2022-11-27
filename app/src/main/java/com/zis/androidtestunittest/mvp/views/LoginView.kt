package com.zis.androidtestunittest.mvp.views

interface LoginView : BaseView {
    fun navigateToMainScreen()
    fun showErrorMessage(message : String)
}