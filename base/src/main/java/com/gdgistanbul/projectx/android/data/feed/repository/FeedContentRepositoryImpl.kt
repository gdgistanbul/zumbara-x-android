package com.gdgistanbul.projectx.android.data.feed.repository

import com.gdgistanbul.projectx.android.data.feed.model.response.FeedItemResponse
import com.gdgistanbul.projectx.android.data.feed.source.FeedContentRemoteDataSource
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FeedContentRepositoryImpl @Inject
constructor(private val remoteDataSource: FeedContentRemoteDataSource) : FeedContentRepository {

    override fun fetchFeedContent(): Observable<FeedItemResponse> {
        return remoteDataSource
                .fetchFeedContent()
                .toObservable()
                .subscribeOn(Schedulers.io())
    }

}