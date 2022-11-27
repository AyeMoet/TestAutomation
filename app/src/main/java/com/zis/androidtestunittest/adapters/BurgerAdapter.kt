package com.zis.androidtestunittest.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.zis.androidtestunittest.R
import com.zis.androidtestunittest.data.vos.BurgerVO
import com.zis.androidtestunittest.delegates.BurgerViewHolderActionDelegate
import com.zis.androidtestunittest.viewholders.BurgerViewHolder

class BurgerAdapter(private val mDelegate : BurgerViewHolderActionDelegate) : BaseRecyclerAdapter<BurgerViewHolder, BurgerVO>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BurgerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_burger,parent,false)
        return BurgerViewHolder(view, mDelegate)
    }
}