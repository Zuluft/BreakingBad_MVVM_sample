package com.zuluft.autoschool.domain.repository

import com.zuluft.autoschool.domain.dataProviders.global.GlobalDataProvider
import com.zuluft.autoschool.domain.dataProviders.local.LocalDataProvider


class RepositoryImpl
constructor(
    private val globalDataProvider: GlobalDataProvider,
    private val localDataProvider: LocalDataProvider
) : Repository {

}