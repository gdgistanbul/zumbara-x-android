package com.gdgistanbul.projectx.android.common.inject.module

import com.dialogmaster.android.common.inject.scope.FragmentScope
import com.gdgistanbul.projectx.android.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun bindFeedItemActivity(): MainActivity
}