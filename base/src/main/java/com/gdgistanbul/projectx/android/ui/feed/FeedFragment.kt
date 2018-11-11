package com.gdgistanbul.projectx.android.ui.feed

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gdgistanbul.projectx.android.BaseFragment
import com.gdgistanbul.projectx.android.BaseNavigationFragment
import com.gdgistanbul.projectx.android.base.databinding.FragmentFeedBinding


class FeedFragment : BaseFragment(), BaseNavigationFragment {

    private lateinit var feedContentViewModel: FeedContentViewModel
    private lateinit var binding: FragmentFeedBinding
    private var feedContentItemAdapter = FeedContentItemAdapter()


    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentFeedBinding.inflate(inflater, container, false)

        binding.recyclerViewFeedContent.setHasFixedSize(true)
        binding.recyclerViewFeedContent.adapter = feedContentItemAdapter
        binding.recyclerViewFeedContent.layoutManager = LinearLayoutManager(activity)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        feedContentViewModel = ViewModelProviders.of(this, viewModelProviderFactory).get(FeedContentViewModel::class.java)

        feedContentViewModel.fetchFeedContent()

        feedContentViewModel.feedContentLive.observe(this, Observer {
            // viewstate.
            it?.let {
                feedContentItemAdapter.addFeedItem(it.feedItems)
            }
        })
    }
}