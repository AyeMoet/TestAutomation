package com.zis.androidtestunittest.mvp.presenters.impls

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.zis.androidtestunittest.data.model.impls.BurgerModelImpl
import com.zis.androidtestunittest.data.vos.BurgerVO
import com.zis.androidtestunittest.mvp.presenters.CartPresenter
import com.zis.androidtestunittest.mvp.views.CartView

class CartPresenterImpl : CartPresenter, BaseAppPresenterImpl<CartView>() {


    private val mBurgerModel = BurgerModelImpl

    override fun onUIReady(owner: LifecycleOwner) {
        mBurgerModel
            .getBurgersInCart()
            .observe(owner, Observer {
                mView.displayItemsInCart(it)
            })
    }

    override fun onTapRemoveFromCart(burger: BurgerVO, adapterPosition : Int) {
        mBurgerModel
            .removeItemFromCart(burger)
    }

    override fun onTapCheckout() {
        mView.displayThankYouMessage()
    }

    override fun onTapCancelThankYouMessage() {
        mView.hideThankYouMessage()
    }
}