package com.adrian.kotlinwithdagger.app.di

import com.adrian.kotlinwithdagger.app.SampleApplication
import dagger.Component

/**
 * Created by cadri on 2017. 05. 28..
 */

@Component(modules = arrayOf(AppModule::class))
interface ApplicationComponent {

    fun inject(sampleApplication: SampleApplication);

    object Injector {
        var component: ApplicationComponent? = null
            private set

        fun inject(myApp: SampleApplication) {
            component = DaggerApplicationComponent.builder()
                    .appModule(AppModule(myApp))
                    .build()
            component!!.inject(myApp)
        }
    }
}