package com.zis.androidtestunittest.mvp.views

import com.zis.androidtestunittest.data.vos.BurgerVO

interface BurgerDetailsView : BaseView {
    fun displayBurgerDetails(burger : BurgerVO)
}