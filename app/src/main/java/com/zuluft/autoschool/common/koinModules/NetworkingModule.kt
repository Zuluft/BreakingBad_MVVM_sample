package com.zuluft.autoschool.common.koinModules

import com.google.gson.GsonBuilder
import com.zuluft.autoschool.R
import com.zuluft.autoschool.common.NODE_BASE_URL
import com.zuluft.autoschool.domain.dataProviders.global.GlobalDataProvider
import okhttp3.OkHttpClient
import org.koin.android.ext.koin.androidContext
import org.koin.core.qualifier.named
import org.koin.dsl.bind
import org.koin.dsl.module
import retrofit2.CallAdapter
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


val networkingModule = module {
    single(named(NODE_BASE_URL)) {
        androidContext().getString(R.string.base_url)
    }

    single {
        GsonBuilder()
            .setDateFormat("MM-dd-yyyy")
            .create()
    }

    single {
        GsonConverterFactory.create(get())
    } bind Converter.Factory::class

    single {
        RxJava2CallAdapterFactory.create()
    } bind CallAdapter.Factory::class

    single {
        OkHttpClient.Builder()
            .build()
    }

    single {
        Retrofit.Builder()
            .client(get())
            .addCallAdapterFactory(get())
            .baseUrl(get<String>(named(NODE_BASE_URL)))
            .addConverterFactory(get())
            .build()
    }

    single {
        get<Retrofit>().create(GlobalDataProvider::class.java)
    }
}