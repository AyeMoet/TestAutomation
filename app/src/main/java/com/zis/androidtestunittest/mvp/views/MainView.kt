package com.zis.androidtestunittest.mvp.views

import android.widget.ImageView
import com.zis.androidtestunittest.data.vos.BurgerVO

interface MainView : BaseView {
    fun displayBurgerList(burgerList : List<BurgerVO>)
    fun navigateToBurgerDetailsScreen(burgerId : Int, burgerImageView : ImageView)
    fun navigatetoCartScreen()
    fun addBurgerToCart(burger : BurgerVO, burgerImageView : ImageView)
    fun displayCountInCart(burgersInCartCount : Int)

}