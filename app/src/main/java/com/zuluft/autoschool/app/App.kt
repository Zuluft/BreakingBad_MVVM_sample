package com.zuluft.autoschool.app

import android.app.Application
import com.zuluft.autoschool.common.koinModules.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


class App : Application() {


    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App.applicationContext)
            modules(
                listOf(
                    localStorageModule,
                    networkingModule,
                    repositoryModule,
                    useCasesModule,
                    viewModelModule
                )
            )
        }
    }

}