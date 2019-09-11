package com.zuluft.autoschool.common.koinModules

import android.preference.PreferenceManager
import androidx.room.Room
import com.zuluft.autoschool.domain.dataProviders.local.LocalDataProvider
import com.zuluft.autoschool.domain.dataProviders.local.LocalDataProviderImpl
import com.zuluft.autoschool.domain.dataProviders.local.database.Database
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module


val localStorageModule = module {

    single {
        PreferenceManager.getDefaultSharedPreferences(androidContext())
    }

    single {
        Room.databaseBuilder(androidContext(), Database::class.java, "database")
    }

    single<LocalDataProvider> {
        LocalDataProviderImpl(get(), get())
    }
}