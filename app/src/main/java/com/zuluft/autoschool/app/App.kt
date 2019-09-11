package com.zuluft.autoschool.app

import android.app.Application
import com.zuluft.autoschool.common.koinModules.localStorageModule
import com.zuluft.autoschool.common.koinModules.networkingModule
import com.zuluft.autoschool.common.koinModules.repositoryModule
import com.zuluft.autoschool.common.koinModules.viewModelModule
import org.koin.core.context.startKoin


class App : Application() {


    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                listOf(
                    localStorageModule,
                    networkingModule,
                    repositoryModule,
                    viewModelModule
                )
            )
        }
    }

}