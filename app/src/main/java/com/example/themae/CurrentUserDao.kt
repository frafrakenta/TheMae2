package com.example.themae

import androidx.room.*

@Dao
interface CurrentUserDao {
    @Query("SELECT * FROM CurrentUser")
    fun getAll(): List<CurrentUser>

    @Query("DELETE FROM CurrentUser where id = :x")
    fun deletecurrentdata(x: Int)

    @Insert
    fun insert(currentuser: CurrentUser)

    @Update
    fun update(currentuser: CurrentUser)

    @Delete
    fun delete(currentuser: CurrentUser)
}