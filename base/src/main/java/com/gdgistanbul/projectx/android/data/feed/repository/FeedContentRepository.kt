package com.gdgistanbul.projectx.android.data.feed.repository

import com.gdgistanbul.projectx.android.data.feed.model.response.FeedItemResponse
import io.reactivex.Observable

interface FeedContentRepository {

    fun fetchFeedContent(): Observable<FeedItemResponse>
}