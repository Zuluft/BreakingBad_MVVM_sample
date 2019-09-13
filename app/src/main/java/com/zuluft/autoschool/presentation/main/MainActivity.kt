package com.zuluft.autoschool.presentation.main

import android.os.Bundle
import com.zuluft.autoschool.R
import com.zuluft.autoschool.common.annotations.LayoutResId
import com.zuluft.autoschool.common.base.BaseActivity
import org.koin.android.viewmodel.ext.android.viewModel

@LayoutResId(R.layout.activity_main)
class MainActivity :
    BaseActivity<MainViewState, MainViewModel>() {

    private val mainViewModel: MainViewModel by viewModel()

    override fun reflectState(viewState: MainViewState) {

    }

    override fun renderView(savedInstanceState: Bundle?) {

    }

    override fun provideViewModel(): MainViewModel {
        return mainViewModel
    }

}
