package com.zuluft.autoschool.presentation.main.charactersList

import androidx.paging.PagedList
import com.zuluft.autoschool.domain.models.CharacterModel

data class CharactersListViewState(
    val pagedList: PagedList<CharacterModel>? = null
)