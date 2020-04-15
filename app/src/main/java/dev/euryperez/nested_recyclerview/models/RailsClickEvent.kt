package dev.euryperez.nested_recyclerview.models

sealed class RailsClickEvent {
    data class TitleItemEvent(val title:RailsItem.RailsTitle) : RailsClickEvent()
    data class DishItemEvent(val dish: Dish) : RailsClickEvent()
}