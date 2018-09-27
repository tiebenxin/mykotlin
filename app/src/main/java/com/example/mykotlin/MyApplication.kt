package com.example.mykotlin

import com.alibaba.android.arouter.launcher.ARouter
import com.example.common.BaseApplication

/**
 * Created by LL130386 on 2018/9/27.
 */
class MyApplication:BaseApplication() {
    override fun onCreate() {
        super.onCreate()
        initRouter()
    }

    private fun initRouter(){
        //开启InstantRun之后，一定要在ARouter.init之前调用openDebug
        ARouter.openDebug()
        ARouter.openLog()
        ARouter.init(this)
    }
}