package com.zuluft.autoschool.presentation.main.home.actions

import androidx.paging.PagedList
import com.zuluft.autoschool.common.base.ViewStateAction
import com.zuluft.autoschool.domain.models.CharacterModel
import com.zuluft.autoschool.presentation.main.home.HomeViewState

class DrawDataAction
    constructor(val pagedList: PagedList<CharacterModel>):
        ViewStateAction<HomeViewState> {
    override fun newState(oldState: HomeViewState): HomeViewState {
        return oldState.copy(pagedList=pagedList)
    }
}