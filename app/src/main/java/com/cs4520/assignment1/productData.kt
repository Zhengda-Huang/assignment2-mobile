package com.cs4520.assignment1

sealed class Product{
    data class item(
        val name: String,
        val type: String,
        val expiryDate: String? = null,
        val price: Int
    )

    val productsDataset : List<item> = listOf(
        item("Treadmill", "Equipment", null, 32),
        item("Banana", "Food", "2024-02-29", 29),
        item("Dumbbells", "Equipment", null, 45),
        item("Apple", "Food", "2024-03-10", 20),
        item("Stationary Bike", "Equipment", null, 50),
        item("Orange", "Food", "2024-03-05", 25),
        item("Yoga Mat", "Equipment", null, 15),
        item("Grapes", "Food", "2024-02-02", 18),
        item("Resistance Bands", "Equipment", null, 22),
        item("Kiwi", "Food", "2024-01-29", 30),
        item("Elliptical Machine", "Equipment", null, 55),
        item("Strawberries", "Food", "2024-03-08", 28),
        item("Weight Bench", "Equipment", null, 40),
        item("Watermelon", "Food", "2024-03-12", 15),
        item("Jump Rope", "Equipment", null, 10),
        item("Blueberries", "Food", "2024-04-05", 22),
        item("Kettlebell", "Equipment", null, 35),
        item("Mango", "Food", "2024-04-10", 33),
        item("Rowing Machine", "Equipment", null, 48),
        item("Pineapple", "Food", "2024-03-20", 26),
        item("Pull-Up Bar", "Equipment", null, 30),
        item("Peach", "Food", "2024-04-15", 23),
        item("Medicine Ball", "Equipment", null, 18),
        item("Cherry", "Food", "2024-04-08", 35),
        item("Foam Roller", "Equipment", null, 20),
        item("Papaya", "Food", "2024-04-18", 32),
        item("Balance Ball", "Equipment", null, 25),
        item("Pear", "Food", "2024-04-20", 27),
        item("Step Platform", "Equipment", null, 15),
        item("Plum", "Food", "2024-04-28", 19),
        item("Battle Ropes", "Equipment", null, 42),
        item("Apricot", "Food", "2024-04-25", 21),
        item("Trampoline", "Equipment", null, 38),
        item("Raspberry", "Food", "2024-05-02", 24),
        item("Gymnastic Rings", "Equipment", null, 50),
        item("Blackberry", "Food", "2024-05-08", 29),
    )

}
