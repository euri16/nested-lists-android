package dev.euryperez.nested_recyclerview.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.euryperez.nested_recyclerview.R
import dev.euryperez.nested_recyclerview.adapters.viewholders.DishViewHolder
import dev.euryperez.nested_recyclerview.inflate
import dev.euryperez.nested_recyclerview.models.Dish
import dev.euryperez.nested_recyclerview.models.RailsClickEvent

class DishAdapter(private val onItemClicked: (RailsClickEvent) -> Unit) : RecyclerView.Adapter<DishViewHolder>() {
    var items:List<Dish> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DishViewHolder(parent.inflate(R.layout.item_dish), onItemClicked)

    override fun onBindViewHolder(holder: DishViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size
}