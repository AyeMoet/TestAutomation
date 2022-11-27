package com.zis.androidtestunittest.delegates

import com.zis.androidtestunittest.data.vos.BurgerVO

interface CartViewHolderActionDelegate {
    fun onTapRemoveFromCart(burger : BurgerVO, adapterPosition : Int)
}