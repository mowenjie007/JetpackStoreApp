package com.yunya365.course

import android.os.Bundle
import android.view.View
import androidx.databinding.ViewDataBinding
import com.yunya365.common.base.BaseFragment
import com.yunya365.jetpackstore.course.R
import com.yunya365.jetpackstore.course.databinding.FragmentCourseBinding

/**
 * Description TODO
 * Author mwj
 * Date 01-10-2024 周三 11:17
 */
class CourseFragment : BaseFragment() {

    override fun getLayoutRes() = R.layout.fragment_course

    override fun bindView(view: View, savedInstanceState: Bundle?): ViewDataBinding {
        return FragmentCourseBinding.bind(view)
    }

}