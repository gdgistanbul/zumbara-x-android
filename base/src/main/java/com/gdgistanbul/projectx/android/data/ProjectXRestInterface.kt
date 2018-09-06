package com.gdgistanbul.projectx.android.data

import com.gdgistanbul.projectx.android.data.feed.model.response.FeedItemResponse
import io.reactivex.Single
import retrofit2.http.GET

interface ProjectXRestInterface {

    @GET("getFeeds")
    fun fetchFeedContent(): Single<FeedItemResponse>
}