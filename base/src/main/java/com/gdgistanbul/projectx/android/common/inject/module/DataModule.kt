package com.gdgistanbul.projectx.android.common.inject.module

import com.gdgistanbul.projectx.android.data.NetworkModule
import com.gdgistanbul.projectx.android.data.feed.FeedModule
import dagger.Module

@Module(includes = [(NetworkModule::class),
    (FeedModule::class)])
class DataModule {


}