package com.gdgistanbul.projectx.android.ui.feed

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gdgistanbul.projectx.android.BaseFragment
import com.gdgistanbul.projectx.android.BaseNavigationFragment
import dagger.android.support.DaggerFragment
import javax.inject.Inject
import com.gdgistanbul.projectx.android.base.databinding.FragmentFeedBinding;
import dagger.android.support.AndroidSupportInjection


class FeedFragment : BaseFragment(), BaseNavigationFragment {


    private lateinit var feedContentViewModel: FeedContentViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        feedContentViewModel = ViewModelProviders.of(this, viewModelProviderFactory).get(FeedContentViewModel::class.java)

        val binding = FragmentFeedBinding.inflate(inflater, container, false).apply {
            setLifecycleOwner(this@FeedFragment)
            viewModel = this@FeedFragment.feedContentViewModel
        }




        feedContentViewModel.fetchFeedContent()


        feedContentViewModel.feedContentLive.observe(this, Observer {
            // viewstate.
        })


       return binding.root
    }

}