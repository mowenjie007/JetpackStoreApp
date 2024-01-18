package com.yunya365.service.assistant

import android.app.Application
import com.didichuxing.doraemonkit.DoraemonKit

/**
 * Description 配置doKit的工具类
 * Author mwj
 * Date 01-18-2024 周四 15:29
 */
object AssistantApp {

    fun initConfig(application: Application){
        DoraemonKit.install(application, mutableListOf(
            ServerHostKit()
        ))
    }

}