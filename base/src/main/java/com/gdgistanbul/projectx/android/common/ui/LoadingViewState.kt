package com.gdgistanbul.projectx.android.common.ui

import com.erkutaras.statelayout.StateLayout
import com.gdgistanbul.projectx.android.data.Status

class LoadingViewState constructor(private val status: Status) {

    fun getLoadingState(): StateLayout.StateInfo? {
        return if (Status.LOADING == status) StateLayout.provideLoadingStateInfo()
        else StateLayout.provideNoneStateInfo()
    }
}