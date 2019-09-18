package com.zuluft.autoschool.domain.useCases

import com.zuluft.autoschool.common.base.BaseUseCase
import com.zuluft.autoschool.domain.models.dataModels.PageDataModel
import com.zuluft.autoschool.domain.repository.Repository
import io.reactivex.Observable

class FetchAndSaveCharactersUseCase(
    repository: Repository,
    private val fetchCharactersUseCase: FetchCharactersUseCase,
    private val saveCharactersUseCase: SaveCharactersUseCase
) :
    BaseUseCase<PageDataModel, Observable<Boolean>>(repository) {
    override fun start(arg: PageDataModel?): Observable<Boolean> {
        return fetchCharactersUseCase.start(arg)
            .flatMap {
                saveCharactersUseCase.start(it)
            }
    }
}