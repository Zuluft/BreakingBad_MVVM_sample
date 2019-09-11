package com.zuluft.autoschool.domain.dataProviders.local

import com.zuluft.autoschool.domain.dataProviders.global.GlobalDataProvider
import com.zuluft.autoschool.domain.dataProviders.local.database.Database


class LocalDataProviderImpl
constructor(
    private val database: Database,
    private val globalDataProvider: GlobalDataProvider
) :
    LocalDataProvider {


}