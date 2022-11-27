package com.zis.androidtestunittest.delegates

import android.widget.ImageView
import com.zis.androidtestunittest.data.vos.BurgerVO

interface BurgerViewHolderActionDelegate {
    fun onTapBurger(burger : BurgerVO, burgerImageView: ImageView)
    fun onTapAddToCart(burger : BurgerVO, burgerImageView: ImageView)
}