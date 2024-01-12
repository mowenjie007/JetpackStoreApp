package com.yunya365.jetpackstore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.yunya365.common.base.BaseActivity
import com.yunya365.jetpackstore.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

//    override fun getLayoutRes(): Int {
//        return R.layout.activity_main
//    }

    override fun getLayoutRes() = R.layout.activity_main

    override fun initConfig() {
        super.initConfig()
    }

    override fun initView() {
        super.initView()
        // 设置navigation
        val navController = findNavController(R.id.fcv_main)
        mBinding.bnvMain.setupWithNavController(navController)
    }

    override fun initData() {
        super.initData()
    }


}