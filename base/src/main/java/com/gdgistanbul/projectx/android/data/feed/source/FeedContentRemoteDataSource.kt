package com.gdgistanbul.projectx.android.data.feed.source

import com.gdgistanbul.projectx.android.data.feed.model.response.FeedItemResponse
import io.reactivex.Single

interface FeedContentRemoteDataSource {

    fun fetchFeedContent(): Single<FeedItemResponse>
}