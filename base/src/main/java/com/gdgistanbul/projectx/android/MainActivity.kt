package com.gdgistanbul.projectx.android

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import com.gdgistanbul.projectx.android.base.R
import com.gdgistanbul.projectx.android.ui.feed.FeedContentViewModel
import com.gdgistanbul.projectx.android.ui.feed.FeedFragment

class MainActivity : BaseActivity() {


    private lateinit var currentFragment: BaseNavigationFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        replaceFragment(FeedFragment())

    }

    private fun <F> replaceFragment(fragment: F) where F : Fragment, F : BaseNavigationFragment {
        supportFragmentManager.inTransaction {
            currentFragment = fragment
            replace(R.id.fragment_container, fragment)
        }
    }

    override fun onBackPressed() {
        if (!currentFragment.onBackPressed()) {
            super.onBackPressed()
        }
    }
}