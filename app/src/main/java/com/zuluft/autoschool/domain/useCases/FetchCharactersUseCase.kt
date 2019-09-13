package com.zuluft.autoschool.domain.useCases

import com.zuluft.autoschool.common.base.BaseUseCase
import com.zuluft.autoschool.domain.models.CharacterModel
import com.zuluft.autoschool.domain.models.dataModels.PageDataModel
import com.zuluft.autoschool.domain.repository.Repository
import io.reactivex.Observable

class FetchCharactersUseCase
    (repository: Repository) :
    BaseUseCase<PageDataModel, Observable<List<CharacterModel>>>(repository) {
    override fun createObservable(arg: PageDataModel?): Observable<List<CharacterModel>> {
        return repository.fetchCharacters(arg!!)
    }
}