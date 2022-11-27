package com.zis.androidtestunittest.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.zis.androidtestunittest.R
import com.zis.androidtestunittest.data.vos.BurgerVO
import com.zis.androidtestunittest.delegates.CartViewHolderActionDelegate
import com.zis.androidtestunittest.viewholders.CartViewHolder

class CartAdapter(private val mDelegate: CartViewHolderActionDelegate) :
    BaseRecyclerAdapter<CartViewHolder, BurgerVO>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.view_item_cart, parent, false)
        return CartViewHolder(view, mDelegate)
    }
}

