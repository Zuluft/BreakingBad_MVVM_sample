package com.zuluft.autoschool.presentation.main.home

import androidx.paging.RxPagedListBuilder
import com.zuluft.autoschool.common.base.BaseViewModel
import com.zuluft.autoschool.domain.useCases.FetchAndSaveCharactersUseCase
import com.zuluft.autoschool.domain.useCases.GetCharactersUseCase
import com.zuluft.autoschool.presentation.main.home.actions.DrawDataAction

class HomeViewModel
constructor(
    getCharactersUseCase: GetCharactersUseCase,
    fetchAndSaveCharactersUseCase: FetchAndSaveCharactersUseCase
) :
    BaseViewModel<HomeViewState>() {
    override fun getInitialState(): HomeViewState {
        return HomeViewState()
    }

    init {
        registerDisposable(
        RxPagedListBuilder(getCharactersUseCase.createObservable(), 5)
            .setBoundaryCallback(
                BoundaryCallback(
                    compositeDisposable,
                    fetchAndSaveCharactersUseCase
                )
            ).buildObservable()
            .subscribe {
                  dispatchAction(DrawDataAction(it))
            })
    }
}