package com.gdgistanbul.projectx.android.extentions

import android.support.annotation.AnimRes
import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import dagger.android.support.DaggerAppCompatActivity


fun DaggerAppCompatActivity.replaceFragmentSafely(fragment: Fragment,
                                                  tag: String,
                                                  allowStateLoss: Boolean = false,
                                                  @IdRes containerViewId: Int,
                                                  @AnimRes enterAnimation: Int = 0,
                                                  @AnimRes exitAnimation: Int = 0,
                                                  @AnimRes popEnterAnimation: Int = 0,
                                                  @AnimRes popExitAnimation: Int = 0) {
    val ft = supportFragmentManager
            .beginTransaction()
            .setCustomAnimations(enterAnimation, exitAnimation, popEnterAnimation, popExitAnimation)
            .replace(containerViewId, fragment, tag)
    if (!supportFragmentManager.isStateSaved) {
        ft.commit()
    } else if (allowStateLoss) {
        ft.commitAllowingStateLoss()
    }
}


fun <T : Fragment> DaggerAppCompatActivity.addFragmentSafely(fragment: T,
                                                        tag: String,
                                                        allowStateLoss: Boolean = false,
                                                        @IdRes containerViewId: Int,
                                                        @AnimRes enterAnimation: Int = 0,
                                                        @AnimRes exitAnimation: Int = 0,
                                                        @AnimRes popEnterAnimation: Int = 0,
                                                        @AnimRes popExitAnimation: Int = 0): T {
    if (!existsFragmentByTag(tag)) {
        val ft = supportFragmentManager.beginTransaction()
        ft.setCustomAnimations(enterAnimation, exitAnimation, popEnterAnimation, popExitAnimation)
        ft.add(containerViewId, fragment, tag)
        if (!supportFragmentManager.isStateSaved) {
            ft.commit()
        } else if (allowStateLoss) {
            ft.commitAllowingStateLoss()
        }
        return fragment
    }
    return findFragmentByTag(tag) as T
}


fun DaggerAppCompatActivity.existsFragmentByTag(tag: String): Boolean {
    return supportFragmentManager.findFragmentByTag(tag) != null
}


fun DaggerAppCompatActivity.findFragmentByTag(tag: String): Fragment? {
    return supportFragmentManager.findFragmentByTag(tag)
}