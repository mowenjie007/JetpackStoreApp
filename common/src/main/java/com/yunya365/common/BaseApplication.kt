package com.yunya365.common

import android.app.Application
import com.blankj.utilcode.util.LogUtils
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

abstract class BaseApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        // 启动Koin依赖注入框架
        startKoin {
            androidLogger(Level.ERROR) // log level Error方能保证这句话不会报错，要么就不写这个
            androidContext(this@BaseApplication)
//            modules()
        }

        initConfig()
        initData()

        LogUtils.d("BaseApplication onCreate")
    }

    /**
     * 可用于必要的配置初始化
     */
    protected open fun initConfig() {}

    /**
     * 可用于子类实现必要的数据初始化
     */
    protected open fun initData() {}
}