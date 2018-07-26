package com.gdgistanbul.projectx.android.ui.feed

import android.arch.lifecycle.ViewModel
import com.gdgistanbul.projectx.android.data.feed.repository.FeedContentRepository
import javax.inject.Inject

class FeedContentViewModel @Inject constructor(val repository: FeedContentRepository) : ViewModel() {

    fun fetchFeedContent() {
        repository.fetchFeedContent()
    }

}