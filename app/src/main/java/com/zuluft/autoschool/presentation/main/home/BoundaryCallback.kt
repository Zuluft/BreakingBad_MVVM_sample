package com.zuluft.autoschool.presentation.main.home

import androidx.paging.PagedList
import com.zuluft.autoschool.domain.models.CharacterModel
import com.zuluft.autoschool.domain.models.dataModels.PageDataModel
import com.zuluft.autoschool.domain.useCases.FetchAndSaveCharactersUseCase
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class BoundaryCallback
constructor(
    private val compositeDisposable: CompositeDisposable,
    private val fetchAndSaveCharactersUseCase: FetchAndSaveCharactersUseCase
) :
    PagedList.BoundaryCallback<CharacterModel>() {

    var initialOffset = 0
    var isLoading = false

    override fun onZeroItemsLoaded() {
        if(!isLoading){
            getNewPage()
        }
    }

    override fun onItemAtEndLoaded(itemAtEnd: CharacterModel) {
        if(!isLoading){
            getNewPage()
        }
    }


    private fun getNewPage() {
        isLoading = true
        compositeDisposable.add(
            fetchAndSaveCharactersUseCase.createObservable(PageDataModel(5, initialOffset))
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe {
                    initialOffset += 5
                    isLoading = false
                }
        )

    }
}