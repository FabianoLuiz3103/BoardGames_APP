package br.com.fabiano.boardgames.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "boardgames")
data class BoardGame (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val description: String
)