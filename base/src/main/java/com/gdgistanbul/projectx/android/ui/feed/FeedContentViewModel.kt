package com.gdgistanbul.projectx.android.ui.feed

import android.arch.lifecycle.ViewModel
import android.util.Log
import com.gdgistanbul.projectx.android.data.Resource
import com.gdgistanbul.projectx.android.data.Status
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
                .subscribe(this::createFeedItemViewState)
    }

    private fun createFeedItemViewState(feedItemResource: Resource<FeedItemResponse>?) {

        feedItemResource?.let {
            if (it.status == Status.SUCCESS) {
                // success state.
            }

            if (it.status == Status.LOADING) {
                // loading state.

            }

            if (it.status == Status.ERROR) {
                // error state.

            }
        }

    }
}