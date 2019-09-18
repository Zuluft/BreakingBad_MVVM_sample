package com.zuluft.autoschool.presentation.main.home.actions

import androidx.paging.PagedList
import com.zuluft.autoschool.domain.models.CharacterModel
import com.zuluft.autoschool.presentation.main.home.HomeViewState
import com.zuluft.mvvm.actions.ViewStateAction

class DrawDataAction
constructor(private val pagedList: PagedList<CharacterModel>) :
    ViewStateAction<HomeViewState> {
    override fun newState(oldState: HomeViewState): HomeViewState {
        return oldState.copy(pagedList = pagedList)
    }
}