package com.gdgistanbul.projectx.android.common.inject.module

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.gdgistanbul.projectx.android.common.inject.ViewModelFactory
import com.gdgistanbul.projectx.android.common.inject.key.ViewModelKey
import com.gdgistanbul.projectx.android.ui.feed.FeedContentViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
internal abstract class ViewModelModule {

    @IntoMap
    @Binds
    @ViewModelKey(FeedContentViewModel::class)
    abstract fun provideFeedContentViewModel(feedContentViewModel: FeedContentViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}