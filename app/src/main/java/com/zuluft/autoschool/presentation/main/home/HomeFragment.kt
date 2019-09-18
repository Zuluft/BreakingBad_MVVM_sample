package com.zuluft.autoschool.presentation.main.home

import android.os.Bundle
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.SimpleItemAnimator
import com.zuluft.autoschool.R
import com.zuluft.autoschool.domain.models.dataModels.HomeScreenDataModel
import com.zuluft.mvvm.common.LayoutResId
import com.zuluft.mvvm.fragments.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

@LayoutResId(R.layout.fragment_home)
class HomeFragment :
    BaseFragment<HomeViewState, HomeViewModel>() {

    private val homeViewModel: HomeViewModel by viewModel {
        parametersOf(HomeFragmentArgs.fromBundle(arguments!!).homeScreenDataModel)
    }

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