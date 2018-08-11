package com.gdgistanbul.projectx.android

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.gdgistanbul.projectx.android.base.R
import com.gdgistanbul.projectx.android.ui.feed.FeedContentViewModel

class MainActivity : BaseActivity() {

    private lateinit var feedContentViewModel: FeedContentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        feedContentViewModel = ViewModelProviders.of(this, viewModelProviderFactory).get(FeedContentViewModel::class.java)


        feedContentViewModel.fetchFeedContent()


        feedContentViewModel.feedContentLive.observe(this, Observer {
            // viewstate.
        })

    }
}