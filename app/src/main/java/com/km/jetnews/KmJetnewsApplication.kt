package com.km.jetnews

import android.app.Application
import com.km.jetnews.data.AppContainer
import com.km.jetnews.data.AppContainerImpl

/**
 * @author: created by wangkm
 * @time: 2021/12/06 23:05
 * @desc：
 * @email: 1240413544@qq.com
 */

class KmJetNewsApplication:Application() {

    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppContainerImpl(this)
    }
}