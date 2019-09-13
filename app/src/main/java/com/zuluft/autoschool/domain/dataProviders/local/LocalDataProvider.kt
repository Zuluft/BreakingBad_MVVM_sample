package com.zuluft.autoschool.domain.dataProviders.local

import androidx.paging.DataSource
import com.zuluft.autoschool.domain.models.CharacterModel
import io.reactivex.Observable


interface LocalDataProvider {
    fun saveCharacters(characterModels: List<CharacterModel>): Observable<Boolean>
    fun getCharacters(): DataSource.Factory<Int, CharacterModel>
}