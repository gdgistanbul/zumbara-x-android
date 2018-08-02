package com.gdgistanbul.projectx.android.data.feed.repository

import com.gdgistanbul.projectx.android.data.feed.source.FeedContentRemoteDataSource
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FeedContentRepositoryImpl @Inject constructor(private val remoteDataSource: FeedContentRemoteDataSource) : FeedContentRepository {

    override fun fetchFeedContent() {
        remoteDataSource.fetchFeedContent()
    }

}