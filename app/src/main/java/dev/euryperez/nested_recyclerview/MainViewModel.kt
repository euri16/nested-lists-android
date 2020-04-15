package dev.euryperez.nested_recyclerview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dev.euryperez.nested_recyclerview.models.Category
import dev.euryperez.nested_recyclerview.models.Dish
import dev.euryperez.nested_recyclerview.models.Menu

class MainViewModel : ViewModel() {

    private val _menuLiveData: MutableLiveData<Menu> = MutableLiveData()
    val menuLiveData:LiveData<Menu> = _menuLiveData

    init {
        val mexDishes = listOf(
            Dish("Tacos", "https://images.unsplash.com/photo-1582234372722-50d7ccc30ebd?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"),
            Dish("Chilaquiles", "https://images.unsplash.com/photo-1582170090097-b251ddbbf7f3?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=914&q=80"),
            Dish("Burritos", "https://images.unsplash.com/photo-1585297099535-d5f84e833797?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"),
            Dish("Nachos", "https://images.unsplash.com/photo-1582169296194-e4d644c48063?ixlib=rb-1.2.1&auto=format&fit=crop&w=1203&q=80"),
            Dish("Enchiladas", "https://images.unsplash.com/photo-1534352956036-cd81e27dd615?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=645&q=80"),
            Dish("Quesadillas", "https://images.freeimages.com/images/large-previews/77a/cheese-quesadilla-1319171.jpg")
        )

        val italianDishes = listOf(
            Dish("Pesto Pasta", "https://images.unsplash.com/photo-1473093295043-cdd812d0e601?ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80"),
            Dish("Lasagna", "https://images.unsplash.com/photo-1551892269-860b1e482f98?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80"),
            Dish("Pizza", "https://images.unsplash.com/photo-1513104890138-7c749659a591?ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80"),
            Dish("Linguini", "https://images.unsplash.com/photo-1541283014184-791fa57c0735?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80"),
            Dish("Risotto", "https://cdn.pixabay.com/photo/2016/10/14/14/29/rice-dish-1740298_960_720.jpg")
        )

        val chineseFood = listOf(
            Dish("Egg Rolls", "https://images.unsplash.com/photo-1548811256-1627d99e7a2c?ixlib=rb-1.2.1&auto=format&fit=crop&w=1000&q=80"),
            Dish("Noodles", "https://images.unsplash.com/photo-1555126634-323283e090fa?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=700&q=80"),
            Dish("Orange Chicken", "https://images.unsplash.com/photo-1525755662778-989d0524087e?ixlib=rb-1.2.1&auto=format&fit=crop&w=1267&q=80"),
            Dish("Pho", "https://images.unsplash.com/photo-1503764654157-72d979d9af2f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1353&q=80"),
            Dish("Dumplings", "https://images.unsplash.com/photo-1563245372-f21724e3856d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1429&q=80")
        )

        val americanFood = listOf(
            Dish("Hamburger", "https://images.unsplash.com/photo-1550950158-d0d960dff51b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1400&q=80"),
            Dish("Pancakes", "https://images.unsplash.com/photo-1509482560494-4126f8225994?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1400&q=80"),
            Dish("Chicken Wings", "https://images.unsplash.com/photo-1566918214014-a3b3e0132267?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1400&q=80"),
            Dish("Ribs", "https://cdn.pixabay.com/photo/2016/08/23/08/52/meat-1613793_960_720.jpg"),
            Dish("Hot Dogs", "https://images.unsplash.com/photo-1542344807-21226ec94b39?ixlib=rb-1.2.1&auto=format&fit=crop&w=1400&q=80")
        )

        val dominicanDishes = listOf(
            Dish("Seafood", "https://images.unsplash.com/photo-1565733618599-cb82f14f34ac?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=675&q=80"),
            Dish("Rices", "https://images.unsplash.com/photo-1570275239925-4af0aa93a0dc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1351&q=80"),
            Dish("Sancocho", "https://fundeu.do/wp-content/uploads/2017/06/sancocho-dominicano-receta.jpg"),
            Dish("Fries Plantain", "https://lh3.googleusercontent.com/proxy/7RLZlYxbUZQ1QXrRkjbxPb0UQksnzRjzbw81ARPL64O32LilPxaS4vF8paMfsOj_ioa23vWafS6g2NRQqOyGxPQG-pSTYjnRqgTT3NAH8FTKssk8ScUjbs6nknjJRba_Wlh3OYHOt_cl"),
            Dish("Arepa", "https://1.bp.blogspot.com/-Zz06Dyl9iBQ/WuooR-qC0GI/AAAAAAAAAtE/5MeVGl-sR4UqqwQGbbJsZYxUle6DzXY1wCLcBGAs/s1600/Arepa_Dominicana.jpg")
        )

        val colombianDishes = listOf(
            Dish("Bandeja Paisa", "https://www.unacolombianaencalifornia.com/wp-content/uploads/2012/08/bandeja_paisa-1-1-e1466957278785.jpg"),
            Dish("Buñuelos", "https://t2.rg.ltmcdn.com/es/images/1/4/4/img_bunuelos_colombianos_31441_600.jpg"),
            Dish("Patacones", "https://cdn.colombia.com/sdi/2012/03/05/patacones-especiales-511773.jpg"),
            Dish("Pandebono", "https://www.vvsupremo.com/wp-content/uploads/2015/11/900X570_Pandebono-Columbian-Cheese-Bread.jpg")
        )

        val categories = listOf(
            Category("Mexican", mexDishes),
            Category("Italian", italianDishes),
            Category("Dominican", dominicanDishes),
            Category("Chinese", chineseFood),
            Category("American", americanFood),
            Category("Colombian", colombianDishes)
        )

        _menuLiveData.value = Menu(categories)
    }
}