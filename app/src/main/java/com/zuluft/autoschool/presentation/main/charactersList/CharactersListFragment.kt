package com.zuluft.autoschool.presentation.main.charactersList

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.SimpleItemAnimator
import com.zuluft.autoschool.R
import com.zuluft.autoschool.presentation.main.charactersList.adapter.CharactersListPagedAdapter
import com.zuluft.mvvm.common.LayoutResId
import com.zuluft.mvvm.fragments.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

@LayoutResId(R.layout.fragment_home)
class CharactersListFragment :
    BaseFragment<CharactersListViewState, CharactersListViewModel>() {

    private val charactersListViewModel: CharactersListViewModel by viewModel {
        parametersOf(
            CharactersListFragmentArgs
                .fromBundle(arguments!!)
                .charactersListScreenDataModel
        )
    }

    override fun reflectState(viewState: CharactersListViewState) {
        viewState.pagedList.let {
            (recyclerView.adapter as CharactersListPagedAdapter).submitList(it)
        }
    }

    override fun renderView(savedInstanceState: Bundle?) {
        recyclerView.layoutManager = LinearLayoutManager(context)
        (recyclerView.itemAnimator as SimpleItemAnimator).supportsChangeAnimations = false
        recyclerView.adapter =
            CharactersListPagedAdapter()
    }

    override fun provideViewModel(): CharactersListViewModel {
        return charactersListViewModel
    }
}