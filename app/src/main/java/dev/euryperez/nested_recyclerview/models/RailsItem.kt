package dev.euryperez.nested_recyclerview.models

sealed class RailsItem(val type:RailsViewType) {
    data class RailsTitle(val title: String) : RailsItem(RailsViewType.TITLE)
    data class RailsList(val items: List<Dish>) : RailsItem(RailsViewType.LIST)

    enum class RailsViewType { TITLE, LIST }
}