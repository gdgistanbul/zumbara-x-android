package com.gdgistanbul.projectx.android.common.inject.module


import com.gdgistanbul.projectx.android.MainActivity
import com.gdgistanbul.projectx.android.common.inject.scope.ActivityScope
import com.gdgistanbul.projectx.android.common.inject.scope.FragmentScope
import com.gdgistanbul.projectx.android.ui.feed.FeedFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilderModule {

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun bindFeedItemActivity(): FeedFragment

}