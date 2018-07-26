package com.dialogmaster.android.common.inject.module

import android.arch.lifecycle.ViewModelProvider
import com.gdgistanbul.projectx.android.common.inject.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
internal abstract class ViewModelModule {

   /* @IntoMap
    @Binds
    @ViewModelKey(TopicsViewModel::class)
    abstract fun provideTopicsViewModel(topicsViewModel: TopicsViewModel): ViewModel*/

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}