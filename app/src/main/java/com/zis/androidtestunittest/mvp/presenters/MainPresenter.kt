package com.zis.androidtestunittest.mvp.presenters

import com.zis.androidtestunittest.mvp.views.MainView
import com.zis.androidtestunittest.delegates.BurgerViewHolderActionDelegate

interface MainPresenter :  BasePresenter<MainView>,BurgerViewHolderActionDelegate{
    fun onTapCart()
}