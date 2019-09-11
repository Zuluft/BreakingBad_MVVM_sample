package com.zuluft.autoschool.presentation.main

import android.util.Log
import com.zuluft.autoschool.common.base.BaseViewModel


class MainViewModel
constructor(private val id: Int) :
    BaseViewModel<MainViewState>() {

    init {
        Log.d("zulufta", id.toString())
    }
}