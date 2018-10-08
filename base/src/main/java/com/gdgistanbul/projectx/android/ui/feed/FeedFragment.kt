package com.gdgistanbul.projectx.android.ui.feed

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.databinding.BindingAdapter
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gdgistanbul.projectx.android.BaseFragment
import com.gdgistanbul.projectx.android.BaseNavigationFragment
import dagger.android.support.DaggerFragment
import javax.inject.Inject
import com.gdgistanbul.projectx.android.base.databinding.FragmentFeedBinding;
import com.gdgistanbul.projectx.android.data.feed.model.response.FeedItem
import dagger.android.support.AndroidSupportInjection


class FeedFragment : BaseFragment(), BaseNavigationFragment {


    private lateinit var feedContentViewModel: FeedContentViewModel
    private lateinit var binding: FragmentFeedBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFeedBinding.inflate(inflater, container, false).apply {
            setLifecycleOwner(this@FeedFragment)
        }

       return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        feedContentViewModel = ViewModelProviders.of(this, viewModelProviderFactory).get(FeedContentViewModel::class.java)

        binding.viewModel = feedContentViewModel

        feedContentViewModel.fetchFeedContent()


        feedContentViewModel.feedContentLive.observe(this, Observer {
            // viewstate.
        })
    }

}