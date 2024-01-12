package com.yunya365.mine

import android.os.Bundle
import android.view.View
import androidx.databinding.ViewDataBinding
import com.yunya365.common.base.BaseFragment
import com.yunya365.jetpackstore.mine.R
import com.yunya365.jetpackstore.mine.databinding.FragmentMineBinding

/**
 * Description TODO
 * Author mwj
 * Date 01-11-2024 周四 15:31
 */
class MineFragment : BaseFragment() {
    override fun getLayoutRes() = R.layout.fragment_mine

    override fun bindView(view: View, savedInstanceState: Bundle?): ViewDataBinding {
        return FragmentMineBinding.bind(view)
    }
}