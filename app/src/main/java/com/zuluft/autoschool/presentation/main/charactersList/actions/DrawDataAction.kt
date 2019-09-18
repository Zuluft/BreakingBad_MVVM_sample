package com.zuluft.autoschool.presentation.main.charactersList.actions

import androidx.paging.PagedList
import com.zuluft.autoschool.domain.models.CharacterModel
import com.zuluft.autoschool.presentation.main.charactersList.CharactersListViewState
import com.zuluft.mvvm.actions.ViewStateAction

class DrawDataAction
    constructor(private val pagedList: PagedList<CharacterModel>):
    ViewStateAction<CharactersListViewState> {
    override fun newState(oldState: CharactersListViewState): CharactersListViewState {
        return oldState.copy(pagedList=pagedList)
    }
}