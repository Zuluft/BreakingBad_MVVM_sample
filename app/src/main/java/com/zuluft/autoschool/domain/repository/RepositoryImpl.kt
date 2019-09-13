package com.zuluft.autoschool.domain.repository

import androidx.paging.DataSource
import com.zuluft.autoschool.domain.dataProviders.global.GlobalDataProvider
import com.zuluft.autoschool.domain.dataProviders.local.LocalDataProvider
import com.zuluft.autoschool.domain.models.CharacterModel
import com.zuluft.autoschool.domain.models.dataModels.PageDataModel
import io.reactivex.Observable


class RepositoryImpl
constructor(
    private val globalDataProvider: GlobalDataProvider,
    private val localDataProvider: LocalDataProvider
) : Repository {
    override fun getCharacters(): DataSource.Factory<Int, CharacterModel> {
        return localDataProvider.getCharacters()
    }

    override fun saveCharacters(characterModels: List<CharacterModel>): Observable<Boolean> {
        return localDataProvider.saveCharacters(characterModels)
    }

    override fun fetchCharacters(arg: PageDataModel): Observable<List<CharacterModel>> {
        return globalDataProvider.fetchCharacters(arg.limit, arg.offset).toObservable()
    }

}