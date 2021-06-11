package com.example.themae

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CurrentUser(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val accountName: String
)