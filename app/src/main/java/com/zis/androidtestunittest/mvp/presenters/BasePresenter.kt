package com.zis.androidtestunittest.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import com.zis.androidtestunittest.mvp.views.BaseView

interface BasePresenter<V: BaseView> {
    fun onUIReady(owner: LifecycleOwner)
    fun initPresenter(view: V)
}