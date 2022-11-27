package com.zis.androidtestunittest

import android.app.Application
import com.zis.androidtestunittest.data.model.impls.BurgerModelImpl
import com.zis.androidtestunittest.data.vos.BurgerVO
import com.zis.androidtestunittest.dummy.getDummyBurgers
import com.zis.androidtestunittest.persistence.BurgerJointDatabase

class BurgerJointApp : Application() {
    override fun onCreate() {
        super.onCreate()
        BurgerModelImpl.init(applicationContext)
        deleteAllBurgers()
        prepopulateBurgers()
    }

    private fun deleteAllBurgers(){
        BurgerJointDatabase.getInstance(applicationContext)
            .getBurgerDao()
            .deleteAllBurgers()
    }

    private fun prepopulateBurgers(){
        BurgerJointDatabase.getInstance(applicationContext)
            .getBurgerDao()
            .insertBurgers(getDummyBurgers())
    }
}