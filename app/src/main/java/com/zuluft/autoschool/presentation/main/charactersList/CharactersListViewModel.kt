package com.zuluft.autoschool.presentation.main.charactersList

import androidx.paging.RxPagedListBuilder
import com.zuluft.autoschool.domain.models.CharacterModel
import com.zuluft.autoschool.domain.models.dataModels.CharacterDetailsDataModel
import com.zuluft.autoschool.domain.useCases.FetchAndSaveCharactersUseCase
import com.zuluft.autoschool.domain.useCases.GetCharactersUseCase
import com.zuluft.autoschool.presentation.main.charactersList.actions.DrawDataAction
import com.zuluft.autoschool.presentation.main.charactersList.actions.GoToCharacterDetailsScreenAction
import com.zuluft.autoschool.presentation.main.charactersList.paging.CharactersListPaginationBoundaryCallback
import com.zuluft.mvvm.viewModels.BaseViewModel

const val PAGE_SIZE = 10

class CharactersListViewModel
constructor(
    getCharactersUseCase: GetCharactersUseCase,
    fetchAndSaveCharactersUseCase: FetchAndSaveCharactersUseCase
) :
    BaseViewModel<CharactersListViewState>() {
    override fun getInitialState(): CharactersListViewState {
        return CharactersListViewState()
    }

    fun onItemSelected(characterModel: CharacterModel) {
        dispatchAction(
            GoToCharacterDetailsScreenAction(
                CharacterDetailsDataModel(
                    characterModel.id,
                    characterModel.name,
                    characterModel.image
                )
            )
        )
    }

    init {
        registerDisposables(
            RxPagedListBuilder(getCharactersUseCase.start(), PAGE_SIZE)
                .setBoundaryCallback(
                    CharactersListPaginationBoundaryCallback(
                        PAGE_SIZE,
                        0,
                        compositeDisposable,
                        fetchAndSaveCharactersUseCase
                    )
                )
                .buildObservable()
                .subscribe {
                    dispatchAction(DrawDataAction(it))
                })
    }
}