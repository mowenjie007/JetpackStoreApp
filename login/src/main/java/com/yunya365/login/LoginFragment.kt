package com.yunya365.login

import android.os.Bundle
import android.view.View
import androidx.databinding.ViewDataBinding
import com.yunya365.common.base.BaseFragment
import com.yunya365.jetpackstore.login.R
import com.yunya365.jetpackstore.login.databinding.FragmentLoginBinding

/**
 * Description TODO
 * Author mwj
 * Date 01-11-2024 周四 15:27
 */
class LoginFragment : BaseFragment() {

    override fun getLayoutRes() = R.layout.fragment_login

    override fun bindView(view: View, savedInstanceState: Bundle?): ViewDataBinding {
        return FragmentLoginBinding.bind(view)
    }
}