package com.gdgistanbul.projectx.android.common.inject.module


import com.gdgistanbul.projectx.android.MainActivity
import com.gdgistanbul.projectx.android.common.inject.scope.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ActivityScope
    @ContributesAndroidInjector
    internal abstract fun mainActivity(): MainActivity
}