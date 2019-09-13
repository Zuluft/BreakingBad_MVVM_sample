package com.zuluft.autoschool.presentation.main.home

import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.SimpleItemAnimator
import com.zuluft.autoschool.R
import com.zuluft.autoschool.common.annotations.LayoutResId
import com.zuluft.autoschool.common.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*
import org.koin.android.viewmodel.ext.android.viewModel

@LayoutResId(R.layout.fragment_home)
class HomeFragment :
    BaseFragment<HomeViewState, HomeViewModel>() {

    private val homeViewModel: HomeViewModel by viewModel()

    override fun reflectState(viewState: HomeViewState) {
        viewState.pagedList.let {
            (recyclerView.adapter as CharactersPagedAdapter).submitList(it)
        }
    }

    override fun renderView(savedInstanceState: Bundle?) {
        recyclerView.layoutManager = LinearLayoutManager(context)
        (recyclerView.itemAnimator as SimpleItemAnimator).supportsChangeAnimations = false
        recyclerView.adapter = CharactersPagedAdapter()
    }

    override fun provideViewModel(): HomeViewModel {
        return homeViewModel
    }
}