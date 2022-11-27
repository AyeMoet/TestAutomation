package com.zis.androidtestunittest.data.model

import android.content.Context
import com.zis.androidtestunittest.persistence.BurgerJointDatabase


abstract class BaseAppModel : BaseModel() {

    protected lateinit var mDatabase: BurgerJointDatabase

    override fun init(context: Context) {
        initDatabase(context)
    }

    private fun initDatabase(context: Context) {
        mDatabase = BurgerJointDatabase.getInstance(context)
    }
}