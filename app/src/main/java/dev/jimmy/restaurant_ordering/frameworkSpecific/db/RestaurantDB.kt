package dev.jimmy.restaurant_ordering.frameworkSpecific.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [],version = 1,exportSchema = false)
abstract class RestaurantDB :RoomDatabase(){
    val db_name = "restaurant_db"

    companion object{

    }
}