package com.gdgistanbul.projectx.android.data.feed.repository

import com.gdgistanbul.projectx.android.data.Resource
import com.gdgistanbul.projectx.android.data.feed.model.response.FeedItemResponse
import com.gdgistanbul.projectx.android.data.feed.source.FeedContentRemoteDataSource
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FeedContentRepositoryImpl @Inject
constructor(private val remoteDataSource: FeedContentRemoteDataSource) : FeedContentRepository {

    override fun fetchFeedContent(): Observable<Resource<FeedItemResponse>> {

        return Observable.just(Resource.loading<FeedItemResponse>())
                .concatWith(remoteDataSource
                        .fetchFeedContent()
                        .toObservable()
                        .map {
                            Resource.success(it)
                        })
                .subscribeOn(Schedulers.io())

    }

}