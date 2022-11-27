package com.zis.androidtestunittest.mvp.presenters.impls

import com.zis.androidtestunittest.mvp.views.BaseView
import com.zis.androidtestunittest.mvp.presenters.AbstractBasePresenter
import com.zis.androidtestunittest.mvp.presenters.BasePresenter

abstract class BaseAppPresenterImpl<V : BaseView> : AbstractBasePresenter<V>(), BasePresenter<V>
