package com.zuluft.autoschool.presentation.main.splash

import com.zuluft.autoschool.domain.models.dataModels.CharactersListScreenDataModel
import com.zuluft.mvvm.models.DisposableValue

data class SplashViewState(
    val goToCharactersListScreen: DisposableValue<CharactersListScreenDataModel>? = null
)