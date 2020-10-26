package com.example.interactrestapiapp.persistance

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.interactrestapiapp.models.AccountProperties
import com.example.interactrestapiapp.models.AuthToken

@Database(entities = [AuthToken::class, AccountProperties::class], version = 1)
abstract class AppDatabase: RoomDatabase(){

    abstract fun getAuthTokenDao(): AuthTokenDao

    abstract fun getAccountPropertiesDao(): AccountPropertiesDao

    companion object{
        const val DATABASE_NAME = "app_db"
    }
}