package com.gdgistanbul.projectx.android.data.feed.source

import com.gdgistanbul.projectx.android.data.ProjectXRestInterface
import com.gdgistanbul.projectx.android.data.feed.model.response.FeedItem
import com.gdgistanbul.projectx.android.data.feed.model.response.FeedItemResponse
import io.reactivex.Single
import javax.inject.Inject

class FeedContentRemoteDataSourceImpl @Inject
constructor(private val projectXRestInterface: ProjectXRestInterface) : FeedContentRemoteDataSource {

    override fun fetchFeedContent(): Single<FeedItemResponse> {
        return projectXRestInterface.fetchFeedContent()
    }
}