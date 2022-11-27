package com.zis.androidtestunittest.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import com.zis.androidtestunittest.mvp.views.BurgerDetailsView

interface BurgerDetailsPresenter : BasePresenter<BurgerDetailsView> {
    fun onBurgerDetailsUiReady(lifecycleOwner: LifecycleOwner, burgerDetailsId: Int)
}