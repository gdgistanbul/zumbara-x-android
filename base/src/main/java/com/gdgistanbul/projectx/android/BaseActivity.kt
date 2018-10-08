package com.gdgistanbul.projectx.android

import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import com.gdgistanbul.projectx.android.base.R
import com.gdgistanbul.projectx.android.extentions.addFragmentSafelfy
import com.gdgistanbul.projectx.android.extentions.replaceFragmentSafely
import dagger.android.AndroidInjection
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

abstract class BaseActivity : DaggerAppCompatActivity() {

    @Inject
    internal lateinit var viewModelProviderFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

    inline fun addFragment(fragment: BaseFragment, tag: String, containerId: Int) {
        addFragmentSafelfy(
                fragment = fragment,
                tag = tag,
                containerViewId = containerId
        )
    }

    inline fun replaceFragment(fragment: BaseFragment, tag: String, containerId: Int) {
        replaceFragmentSafely(
                fragment = fragment,
                tag = tag,
                containerViewId = containerId,
                allowStateLoss = true
        )
    }
}