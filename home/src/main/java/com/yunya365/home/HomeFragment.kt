package com.yunya365.home

import android.os.Bundle
import android.view.View
import androidx.databinding.ViewDataBinding
import com.yunya365.common.base.BaseFragment
import com.yunya365.jetpackstore.home.R
import com.yunya365.jetpackstore.home.databinding.FragmentHomeBinding

/**
 * Description TODO
 * Author mwj
 * Date 01-10-2024 周三 15:47
 */
class HomeFragment : BaseFragment() {

    override fun getLayoutRes(): Int {
        return R.layout.fragment_home
    }

    override fun bindView(view: View, savedInstanceState: Bundle?): ViewDataBinding {
        return FragmentHomeBinding.bind(view)
    }
}