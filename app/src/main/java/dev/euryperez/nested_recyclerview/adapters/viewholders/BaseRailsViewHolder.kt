package dev.euryperez.nested_recyclerview.adapters.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import dev.euryperez.nested_recyclerview.models.RailsItem

abstract class BaseRailsViewHolder<T : RailsItem>(view: View) : RecyclerView.ViewHolder(view) {
    abstract fun bind(item: T)
}