package com.example.themae

import androidx.room.*

@Dao
interface AccountDao {
    @Query("SELECT * FROM Account where id = :x")
    fun getAccountdata(x: Int): List<Account>

    @Insert
    fun insert(account: Account)

    @Update
    fun update(account: Account)

    @Delete
    fun delete(account: Account)
}