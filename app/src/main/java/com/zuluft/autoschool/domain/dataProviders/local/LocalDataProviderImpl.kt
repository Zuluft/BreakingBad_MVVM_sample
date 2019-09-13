package com.zuluft.autoschool.domain.dataProviders.local

import androidx.paging.DataSource
import com.zuluft.autoschool.domain.dataProviders.global.GlobalDataProvider
import com.zuluft.autoschool.domain.dataProviders.local.database.Database
import com.zuluft.autoschool.domain.models.CharacterModel
import io.reactivex.Observable


class LocalDataProviderImpl
constructor(
    private val database: Database,
    private val globalDataProvider: GlobalDataProvider
) :
    LocalDataProvider {
    override fun getCharacters(): DataSource.Factory<Int, CharacterModel> {
        return database.getCharactersDao().select()
    }

    override fun saveCharacters(characterModels: List<CharacterModel>): Observable<Boolean> {
        return Observable.fromCallable {
            database.getCharactersDao().insert(characterModels)
            true
        }
    }


}