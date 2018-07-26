package com.gdgistanbul.projectx.android.common.inject.module

import com.gdgistanbul.projectx.android.data.NetworkModule
import dagger.Module

@Module(includes = arrayOf(NetworkModule::class))
class DataModule {
}