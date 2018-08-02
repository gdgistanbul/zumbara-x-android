package com.gdgistanbul.projectx.android.ui.feed

import android.arch.lifecycle.ViewModel
import com.gdgistanbul.projectx.android.data.feed.model.response.FeedItemResponse
import com.gdgistanbul.projectx.android.data.feed.repository.FeedContentRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject

class FeedContentViewModel @Inject
constructor(private val repository: FeedContentRepository) : ViewModel() {

    fun fetchFeedContent() {
        repository
                .fetchFeedContent()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { t: FeedItemResponse? -> createFeedItemViewState(t) }
    }

    private fun createFeedItemViewState(feedItemResponse: FeedItemResponse?) {

        feedItemResponse?.let {
            it.feedItems
        }
    }
}