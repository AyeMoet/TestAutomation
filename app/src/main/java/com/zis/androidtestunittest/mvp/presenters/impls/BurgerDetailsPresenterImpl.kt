package com.zis.androidtestunittest.mvp.presenters.impls

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.zis.androidtestunittest.mvp.views.BurgerDetailsView
import com.zis.androidtestunittest.data.model.impls.BurgerModelImpl
import com.zis.androidtestunittest.mvp.presenters.BurgerDetailsPresenter

class BurgerDetailsPresenterImpl : BurgerDetailsPresenter,
    BaseAppPresenterImpl<BurgerDetailsView>() {

    private val mBurgerModel = BurgerModelImpl

    override fun onBurgerDetailsUiReady(lifecycleOwner: LifecycleOwner, burgerDetailsId: Int) {
        mBurgerModel.findBurgerById(burgerDetailsId)
            .observe(lifecycleOwner, Observer {
                mView.displayBurgerDetails(it)
            })
    }

    override fun onUIReady(owner: LifecycleOwner) {

    }
}