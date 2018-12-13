package com.gdgistanbul.projectx.android.ui.feed

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.gdgistanbul.projectx.android.common.ui.LoadingViewState
import com.gdgistanbul.projectx.android.data.Resource
import com.gdgistanbul.projectx.android.data.Status
import com.gdgistanbul.projectx.android.data.feed.model.response.FeedItemResponse
import com.gdgistanbul.projectx.android.data.feed.repository.FeedContentRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject

class FeedContentViewModel @Inject constructor(private val repository: FeedContentRepository) : ViewModel() {

    val feedContentLive: MutableLiveData<FeedContentViewState> = MutableLiveData()
    val loadingStateLiveData: MutableLiveData<LoadingViewState> = MutableLiveData()

    fun fetchFeedContent() {
        repository
            .fetchFeedContent()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(this::createFeedItemViewState)
    }

    private fun createFeedItemViewState(feedItemResource: Resource<FeedItemResponse>) {


        feedItemResource.let {

            if (it.status == Status.LOADING) {
                loadingStateLiveData.value = LoadingViewState(feedItemResource.status)
            }

            if (it.status == Status.SUCCESS) {
                // success state.
                feedItemResource.data?.let {
                    feedContentLive.value = FeedContentViewState(feedItemResource.data.feedItems)
                }
            }
        }

    }
}