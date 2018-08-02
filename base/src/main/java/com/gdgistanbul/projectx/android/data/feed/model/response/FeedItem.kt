package com.gdgistanbul.projectx.android.data.feed.model.response


data class FeedItem(var id: String,
                    val categoryId: String,
                    val userId: String,
                    val lat: Double,
                    val long: Double,
                    val title: String,
                    val openingTime: Long,
                    val maxLiveTime: Long,
                    val serviceHour: Int,
                    val numberOfComments: Int,
                    val numberOfBids: Int) {
}