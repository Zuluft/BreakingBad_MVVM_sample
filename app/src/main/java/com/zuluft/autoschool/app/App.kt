package com.zuluft.autoschool.app

import com.facebook.drawee.backends.pipeline.Fresco
import com.zuluft.autoschool.common.koinModules.*
import com.zuluft.mvvm.app.MvvmApplication
import org.koin.core.module.Module


class App : MvvmApplication() {

    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(this)
    }

    override fun provideModules(): List<Module> {
        return listOf(
            localStorageModule,
            networkingModule,
            repositoryModule,
            useCasesModule,
            viewModelModule
        )
    }

}