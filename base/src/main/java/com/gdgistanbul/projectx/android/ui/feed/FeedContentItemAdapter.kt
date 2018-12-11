package com.gdgistanbul.projectx.android.ui.feed

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.gdgistanbul.projectx.android.base.R
import com.gdgistanbul.projectx.android.base.databinding.ItemFeedContentCardBinding
import com.gdgistanbul.projectx.android.data.feed.model.response.FeedItem

class FeedContentItemAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val feedItems: MutableList<FeedItem> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedContentItemViewHolder {
        return FeedContentItemViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val feedItem = feedItems[position]
        (holder as FeedContentItemViewHolder).bind(feedItem)
    }

    override fun getItemCount(): Int = feedItems.size


    fun addFeedItem(feedItemList: MutableList<FeedItem>) {
        val beforeSize = feedItems.size
        feedItems.addAll(feedItemList)
        notifyItemRangeInserted(beforeSize, feedItemList.size)
    }

    class FeedContentItemViewHolder(private val binding: ItemFeedContentCardBinding) : RecyclerView.ViewHolder(binding.root) {

        companion object {

            internal fun create(parent: ViewGroup): FeedContentItemViewHolder {

                val binding = DataBindingUtil.inflate<ItemFeedContentCardBinding>(LayoutInflater.from(parent.context),
                    R.layout.item_feed_content_card,
                    parent,
                    false)

                return FeedContentItemViewHolder(binding)
            }
        }

        internal fun bind(feedItem: FeedItem) {
            val viewState = FeedContentItemViewState(feedItem)
            binding.viewState = viewState
            binding.executePendingBindings()
        }
    }
}