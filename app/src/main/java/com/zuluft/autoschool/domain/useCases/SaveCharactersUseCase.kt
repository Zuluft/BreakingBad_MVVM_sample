package com.zuluft.autoschool.domain.useCases

import com.zuluft.autoschool.common.base.BaseUseCase
import com.zuluft.autoschool.domain.models.CharacterModel
import com.zuluft.autoschool.domain.repository.Repository
import io.reactivex.Observable

class SaveCharactersUseCase(repository: Repository) :
    BaseUseCase<List<CharacterModel>, Observable<Boolean>>(repository) {
    override fun createObservable(arg: List<CharacterModel>?): Observable<Boolean> {
        return repository.saveCharacters(arg!!)
    }
}