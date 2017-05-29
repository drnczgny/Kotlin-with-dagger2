package com.adrian.kotlinwithdagger.app

import android.app.Application
import com.adrian.kotlinwithdagger.app.di.ApplicationComponent

/**
 * Created by cadri on 2017. 05. 28..
 */

class SampleApplication : Application() {

    companion object {
        lateinit var applicationComponent: ApplicationComponent;
    }

    override fun onCreate() {
        super.onCreate()
        ApplicationComponent.Injector.inject(this)
    }
}