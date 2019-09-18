package com.zuluft.autoschool.domain.useCases

import androidx.paging.DataSource
import com.zuluft.autoschool.common.base.BaseUseCase
import com.zuluft.autoschool.domain.models.CharacterModel
import com.zuluft.autoschool.domain.repository.Repository


class GetCharactersUseCase(repository: Repository) :
    BaseUseCase<Unit, DataSource.Factory<Int, CharacterModel>>(repository) {
    override fun start(arg: Unit?): DataSource.Factory<Int, CharacterModel> {
        return repository.getCharacters()
    }
}