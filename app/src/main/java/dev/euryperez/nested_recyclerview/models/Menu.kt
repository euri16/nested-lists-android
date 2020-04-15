package dev.euryperez.nested_recyclerview.models

data class Menu(val categories:List<Category>)

data class Category(val title:String, val dishes:List<Dish>)

data class Dish(val name:String, val pictureUrl:String)