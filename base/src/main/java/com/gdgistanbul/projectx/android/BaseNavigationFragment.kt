package com.gdgistanbul.projectx.android


/**
 * Main navigates pages should implement this interface
 */
interface BaseNavigationFragment{

    fun onBackPressed(): Boolean {
        return false
    }

}