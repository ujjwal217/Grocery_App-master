package com.aryan.groceryapp

import com.aryan.groceryapp.GroceryDatabase
import com.aryan.groceryapp.GroceryItems

class GroceryRepository(private val db: GroceryDatabase) {
    suspend fun insert(items: GroceryItems) = db.getGroceryDao().insert(items)
    suspend fun delete(items: GroceryItems) = db.getGroceryDao().delete(items)

    fun getAllItems() = db.getGroceryDao().getAllGroceryItems()
}