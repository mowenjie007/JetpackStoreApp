package com.yunya365.service.assistant

import android.content.Context
import com.didichuxing.doraemonkit.kit.AbstractKit
import com.yunya365.jetpackstore.service.R

/**
 * Description 用于配置切换不同的接口host，调试工具
 * Author mwj
 * Date 01-18-2024 周四 15:17
 */
class ServerHostKit: AbstractKit() {

    override val icon: Int
        get() = R.drawable.icon_server_host
    override val name: Int
        get() = R.string.str_server_host_dokit

    override fun onAppInit(context: Context?) {
        TODO("Not yet implemented")
    }

    override fun onClick(context: Context?) {
        TODO("Not yet implemented")
    }
}