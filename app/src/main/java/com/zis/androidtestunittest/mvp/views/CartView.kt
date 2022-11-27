package com.zis.androidtestunittest.mvp.views

import com.zis.androidtestunittest.data.vos.BurgerVO

interface CartView : BaseView {
    fun displayItemsInCart(burgers : List<BurgerVO>)
    fun displayThankYouMessage()
    fun hideThankYouMessage()
    fun animateRemoveItemFromCart(adapterPosition : Int)
}