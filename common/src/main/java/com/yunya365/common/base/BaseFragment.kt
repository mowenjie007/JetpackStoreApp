package com.yunya365.common.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData

/**
 * Description TODO
 * Author mwj
 * Date 01-08-2024 周一 11:25
 */
abstract class BaseFragment: Fragment {

    constructor(): super()

    constructor(@LayoutRes layout: Int) : super(layout)

    private var mBinding: ViewDataBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(getLayoutRes(), container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding = bindView(view, savedInstanceState)
//        mBinding?.apply {
//            lifecycleOwner = viewLifecycleOwner
//        }
        mBinding?.lifecycleOwner = viewLifecycleOwner
        initConfig()
        initData()
    }

    override fun onDestroy() {
        super.onDestroy()
        mBinding?.unbind()
    }

    @LayoutRes
    abstract fun getLayoutRes() : Int

    abstract fun bindView(view: View, savedInstanceState: Bundle?) : ViewDataBinding

    open fun initConfig(){}

    open fun initData(){}

    /**
     * 扩展liveData的observe函数
     */
    protected fun<T: Any> LiveData<T>.observerKt(block: (T?) -> Unit){
        this.observe(viewLifecycleOwner, {
//            block.invoke(it)
            block(it)
        })
    }
}