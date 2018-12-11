package com.gdgistanbul.projectx.android.ui.feed

import com.gdgistanbul.projectx.android.data.feed.model.response.FeedItem

class FeedContentItemViewState(val feedItem: FeedItem) {


    fun getTitle(): String = feedItem.title

}