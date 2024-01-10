package com.yunya365.common.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.LiveData
import com.yunya365.common.ktx.bindView

/**
 * Description 封装基类Activity
 * Author mwj
 * Date 01-08-2024 周一 11:17
 */
abstract class BaseActivity<ActBinding : ViewDataBinding>: AppCompatActivity {

    constructor(): super()

    constructor(@LayoutRes layout: Int) : super(layout)

    protected lateinit var mBinding: ActBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = bindView<ActBinding>(getLayoutRes())
    }

    override fun onDestroy() {
        super.onDestroy()
        if(this::mBinding.isInitialized){
            mBinding.unbind()
        }
    }

    @LayoutRes
    abstract fun getLayoutRes(): Int

    open fun initConfig(){}

    open fun initView(){}

    open fun initData(){}

    /**
     * 扩展liveData的observe函数
     */
    protected fun<T: Any> LiveData<T>.observerKt(block: (T?) -> Unit){
        this.observe(this@BaseActivity, {
//            block.invoke(it)
            block(it)
        })
    }

}