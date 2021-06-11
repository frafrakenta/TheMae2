package com.example.themae

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    var title: String,
    var content: String,
    var username: String,
    var datetime: String,
    var like: Int
)