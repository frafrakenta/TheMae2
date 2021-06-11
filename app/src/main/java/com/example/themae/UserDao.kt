package com.example.themae

import androidx.room.*

@Dao
interface UserDao {
    @Query("SELECT * FROM user")
    fun getAll(): List<User>

    @Query("SELECT * FROM User where id = :x")
    fun getdata(x: Int): List<User>

    @Query("SELECT * FROM user order by `like` desc")
    fun getDatalike(): List<User>

    @Insert
    fun insert(user: User)

    @Update
    fun update(user: User)


    @Delete
    fun delete(user: User)

    @Query("DELETE FROM user where id = :x")
    fun deletedata(x: Int)
}