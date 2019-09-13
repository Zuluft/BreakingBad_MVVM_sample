package com.zuluft.autoschool.domain.repository

import androidx.paging.DataSource
import com.zuluft.autoschool.domain.models.CharacterModel
import com.zuluft.autoschool.domain.models.dataModels.PageDataModel
import io.reactivex.Observable


interface Repository {
    fun fetchCharacters(arg: PageDataModel): Observable<List<CharacterModel>>
    fun saveCharacters(characterModels: List<CharacterModel>): Observable<Boolean>
    fun getCharacters(): DataSource.Factory<Int, CharacterModel>
}