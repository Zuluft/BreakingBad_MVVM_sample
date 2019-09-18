package com.zuluft.autoschool.presentation.main.charactersList.paging

import androidx.paging.PagedList
import com.zuluft.autoschool.domain.models.CharacterModel
import com.zuluft.autoschool.domain.models.dataModels.PageDataModel
import com.zuluft.autoschool.domain.useCases.FetchAndSaveCharactersUseCase
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class CharactersListPaginationBoundaryCallback
constructor(
    private val pageSize: Int,
    private var offset: Int,
    private val compositeDisposable: CompositeDisposable,
    private val fetchAndSaveCharactersUseCase: FetchAndSaveCharactersUseCase
) :
    PagedList.BoundaryCallback<CharacterModel>() {

    var isLoading = false

    override fun onZeroItemsLoaded() {
        if (!isLoading) {
            getNewPage()
        }
    }

    override fun onItemAtEndLoaded(itemAtEnd: CharacterModel) {
        if (!isLoading) {
            getNewPage()
        }
    }


    private fun getNewPage() {
        isLoading = true
        compositeDisposable.add(
            fetchAndSaveCharactersUseCase.start(PageDataModel(pageSize, offset))
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe {
                    offset += pageSize
                    isLoading = false
                }
        )

    }
}