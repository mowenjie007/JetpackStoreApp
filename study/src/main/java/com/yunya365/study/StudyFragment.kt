package com.yunya365.study

import android.os.Bundle
import android.view.View
import androidx.databinding.ViewDataBinding
import com.yunya365.common.base.BaseFragment
import com.yunya365.jetpackstore.study.R
import com.yunya365.jetpackstore.study.databinding.FragmentStudyBinding

/**
 * Description TODO
 * Author mwj
 * Date 01-11-2024 周四 15:34
 */
class StudyFragment : BaseFragment() {

    override fun getLayoutRes() = R.layout.fragment_study

    override fun bindView(view: View, savedInstanceState: Bundle?): ViewDataBinding {
        return FragmentStudyBinding.bind(view)
    }
}