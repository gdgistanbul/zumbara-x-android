package com.gdgistanbul.projectx.android.data.feed.source

import com.gdgistanbul.projectx.android.data.ProjectXRestInterface
import javax.inject.Inject

class FeedContentRemoteDataSourceImpl @Inject constructor(val projectXRestInterface: ProjectXRestInterface) : FeedContentRemoteDataSource {

    override fun fetchFeedContent() {
        projectXRestInterface.fetchFeedContent()
    }
}