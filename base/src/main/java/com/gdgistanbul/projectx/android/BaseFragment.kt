package com.gdgistanbul.projectx.android

import android.arch.lifecycle.ViewModelProvider
import android.content.Context
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.DaggerFragment
import javax.inject.Inject

open class BaseFragment: DaggerFragment() {
    @Inject
    internal lateinit var viewModelProviderFactory: ViewModelProvider.Factory

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }
}