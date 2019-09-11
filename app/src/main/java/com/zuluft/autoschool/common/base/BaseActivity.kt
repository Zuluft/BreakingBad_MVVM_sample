package com.zuluft.autoschool.common.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.zuluft.autoschool.common.annotations.LayoutResId
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable


abstract class BaseActivity<ViewState, ViewModel : BaseViewModel<ViewState>> :
    AppCompatActivity() {

    private lateinit var viewModel: ViewModel

    private var compositeDisposable: CompositeDisposable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        compositeDisposable = CompositeDisposable()
        val layoutResourceId = javaClass.getAnnotation(LayoutResId::class.java)
        if (layoutResourceId != null) {
            setContentView(layoutResourceId.value)
        }
        renderView(savedInstanceState)
        viewModel = provideViewModel()
        viewModel.getViewState()
            .observe(this,
                Observer {
                    reflectState(it)
                })
    }

    fun getViewModel(): ViewModel {
        return viewModel
    }

    abstract fun reflectState(viewState: ViewState)

    abstract fun renderView(savedInstanceState: Bundle?)

    abstract fun provideViewModel(): ViewModel

    protected fun registerDisposables(vararg disposables: Disposable) {
        compositeDisposable!!.addAll(*disposables)
    }

}