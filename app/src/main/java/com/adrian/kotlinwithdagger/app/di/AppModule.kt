package com.adrian.kotlinwithdagger.app.di

import android.content.Context
import android.content.SharedPreferences
import com.adrian.kotlinwithdagger.app.SampleApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by cadri on 2017. 05. 28..
 */

@Module
class AppModule(val app: SampleApplication) {

    @Provides
    @Singleton
    fun provideContext(): Context = app

    @Provides
    @Singleton
    fun provideApplication() = app

    @Provides
    @Singleton
    fun provideSharedPreferences(app: Context): SharedPreferences {
        return app.getSharedPreferences("PREFS", Context.MODE_PRIVATE)
    }
}
