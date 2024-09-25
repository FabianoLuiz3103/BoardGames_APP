package br.com.fabiano.boardgames.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.fabiano.boardgames.dao.BoardGameDao
import br.com.fabiano.boardgames.entity.BoardGame

@Database(entities = [BoardGame::class], version = 1)
abstract class BoardGameDatabase : RoomDatabase() {
    abstract fun boardGameDao(): BoardGameDao
    companion object {
        @Volatile
        private var INSTANCE: BoardGameDatabase? = null
        fun getDatabase(context: Context): BoardGameDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    BoardGameDatabase::class.java,
                    "board_game_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}