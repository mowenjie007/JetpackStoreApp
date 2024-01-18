package com.yunya365.jetpackstore

import com.yunya365.common.BaseApplication
import com.yunya365.common.ktx.application
import com.yunya365.service.assistant.AssistantApp

/**
 * Description Application的声明类
 * Author mwj
 * Date 01-18-2024 周四 15:32
 */
class CnApplication: BaseApplication() {

    override fun initConfig() {
        super.initConfig()
        // doKit的初始化配置
        AssistantApp.initConfig(application)
    }
}