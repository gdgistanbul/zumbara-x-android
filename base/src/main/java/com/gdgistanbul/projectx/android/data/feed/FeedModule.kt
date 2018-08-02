package com.gdgistanbul.projectx.android.data.feed

import com.gdgistanbul.projectx.android.data.feed.repository.FeedContentRepository
import com.gdgistanbul.projectx.android.data.feed.repository.FeedContentRepositoryImpl
import com.gdgistanbul.projectx.android.data.feed.source.FeedContentRemoteDataSource
import com.gdgistanbul.projectx.android.data.feed.source.FeedContentRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
abstract class FeedModule {

    @Binds
    abstract fun bindFeedContentRemoteDataSource(feedContentRemoteDataSource: FeedContentRemoteDataSourceImpl): FeedContentRemoteDataSource

    @Binds
    abstract fun bindFeedContentRepository(feedContentRepository: FeedContentRepositoryImpl): FeedContentRepository
}