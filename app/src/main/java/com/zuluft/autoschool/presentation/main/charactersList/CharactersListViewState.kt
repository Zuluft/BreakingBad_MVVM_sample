package com.zuluft.autoschool.presentation.main.charactersList

import androidx.paging.PagedList
import com.zuluft.autoschool.domain.models.CharacterModel
import com.zuluft.autoschool.domain.models.dataModels.CharacterDetailsDataModel
import com.zuluft.mvvm.models.DisposableValue

data class CharactersListViewState(
    val pagedList: PagedList<CharacterModel>? = null,
    val goToCharacterDetailsScreen: DisposableValue<CharacterDetailsDataModel>? = null
)