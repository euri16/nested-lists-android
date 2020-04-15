package dev.euryperez.nested_recyclerview.adapters.viewholders

import android.view.View
import android.widget.TextView
import dev.euryperez.nested_recyclerview.R
import dev.euryperez.nested_recyclerview.models.RailsClickEvent
import dev.euryperez.nested_recyclerview.models.RailsItem

class RailsTitleViewHolder(view: View, val onItemClicked: (RailsClickEvent) -> Unit) : BaseRailsViewHolder<RailsItem.RailsTitle>(view) {
    private val tvTitle by lazy { view.findViewById<TextView>(R.id.tv_rails_title) }

    override fun bind(item: RailsItem.RailsTitle) {
        tvTitle.text = item.title

        itemView.setOnClickListener {
            onItemClicked(RailsClickEvent.TitleItemEvent(item))
        }
    }
}