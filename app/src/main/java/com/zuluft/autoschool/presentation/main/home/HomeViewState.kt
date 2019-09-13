package com.zuluft.autoschool.presentation.main.home

import androidx.paging.PagedList
import com.zuluft.autoschool.domain.models.CharacterModel

data class HomeViewState(
    val pagedList: PagedList<CharacterModel>? = null
)