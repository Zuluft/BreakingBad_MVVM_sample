package com.zuluft.autoschool.presentation.main

import android.os.Bundle
import com.zuluft.autoschool.R
import com.zuluft.autoschool.common.base.BaseActivity
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class MainActivity :
    BaseActivity<MainViewState, MainViewModel>() {

    private val mainViewModel: MainViewModel by viewModel {
        parametersOf(4)
    }

    override fun reflectState(viewState: MainViewState) {

    }

    override fun renderView(savedInstanceState: Bundle?) {

    }

    override fun provideViewModel(): MainViewModel {
        return mainViewModel
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
