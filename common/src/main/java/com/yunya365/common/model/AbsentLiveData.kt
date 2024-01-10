package com.yunya365.common.model

import androidx.lifecycle.LiveData

/**
 * Description 创建一个空的liveData的对象类
 * Author mwj
 * Date 01-09-2024 周二 10:21
 */
class AbsentLiveData<T: Any?> private constructor() : LiveData<T>() {

    init {
        postValue(null)
    }

    companion object {
        fun <T : Any?> create() : LiveData<T> {
            return AbsentLiveData()
        }
    }
}