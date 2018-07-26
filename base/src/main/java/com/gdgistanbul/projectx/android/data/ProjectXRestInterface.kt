package com.gdgistanbul.projectx.android.data

import retrofit2.http.GET

interface ProjectXRestInterface {

    @GET("")
    fun fetchFeedContent()
}