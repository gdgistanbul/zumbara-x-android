package com.gdgistanbul.projectx.android.ui.feed

import com.erkutaras.statelayout.StateLayout
import com.gdgistanbul.projectx.android.data.feed.model.response.FeedItem

class FeedContentViewState(val feedItems: MutableList<FeedItem>) {

    fun getSuccessState(): StateLayout.StateInfo {
        return StateLayout.provideContentStateInfo()
    }

}