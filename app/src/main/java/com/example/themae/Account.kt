package com.example.themae

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Account(
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    val accountName: String,

    var accountPassword: String
)