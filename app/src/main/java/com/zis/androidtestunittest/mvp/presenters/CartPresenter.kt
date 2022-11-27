package com.zis.androidtestunittest.mvp.presenters

import com.zis.androidtestunittest.delegates.CartViewHolderActionDelegate
import com.zis.androidtestunittest.mvp.views.CartView

interface CartPresenter : BasePresenter<CartView>, CartViewHolderActionDelegate {
    fun onTapCheckout()
    fun onTapCancelThankYouMessage()
}