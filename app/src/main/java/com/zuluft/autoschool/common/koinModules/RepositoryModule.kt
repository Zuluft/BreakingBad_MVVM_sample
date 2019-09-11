package com.zuluft.autoschool.common.koinModules

import com.zuluft.autoschool.domain.repository.Repository
import com.zuluft.autoschool.domain.repository.RepositoryImpl
import org.koin.dsl.module


val repositoryModule = module {

    single<Repository> {
        RepositoryImpl(get(), get())
    }


}