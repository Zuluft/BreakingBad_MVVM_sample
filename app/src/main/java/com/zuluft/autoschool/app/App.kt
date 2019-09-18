package com.zuluft.autoschool.app

import com.zuluft.autoschool.common.koinModules.*
import com.zuluft.mvvm.app.MvvmApplication
import org.koin.core.module.Module


class App : MvvmApplication() {

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