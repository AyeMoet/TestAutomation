package com.zis.androidtestunittest.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.zis.androidtestunittest.mvp.views.BaseView
import com.zis.androidtestunittest.mvp.presenters.AbstractBasePresenter

abstract class BaseActivity : AppCompatActivity(), BaseView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    inline fun <reified T : AbstractBasePresenter<W>, reified W:BaseView> getPresenter(): T {
        val presenter = ViewModelProviders.of(this).get(T::class.java)
        if (this is W) presenter.initPresenter(this)
        return presenter
    }
}