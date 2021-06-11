package com.example.themae

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [CurrentUser::class], version = 1)
abstract class CurrentUserDatabase : RoomDatabase() {

    abstract fun currentuserDao(): CurrentUserDao

    companion object {

        private var INSTANCE: CurrentUserDatabase? = null

        private val lock = Any()

        fun getInstance(context: Context): CurrentUserDatabase {
            synchronized(lock) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        CurrentUserDatabase::class.java, "CurrentUser.db"
                    )
                        .allowMainThreadQueries()
                        .build()
                }
                return INSTANCE!!
            }
        }
    }
}