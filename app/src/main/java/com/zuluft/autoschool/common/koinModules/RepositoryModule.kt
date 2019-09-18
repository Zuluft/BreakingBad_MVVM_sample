package com.zuluft.autoschool.common.koinModules

import com.zuluft.autoschool.domain.repository.Repository
import com.zuluft.autoschool.domain.repository.RepositoryImpl
import org.koin.dsl.bind
import org.koin.dsl.module


val repositoryModule = module {

    single {
        RepositoryImpl(get(), get())
    } bind Repository::class


}