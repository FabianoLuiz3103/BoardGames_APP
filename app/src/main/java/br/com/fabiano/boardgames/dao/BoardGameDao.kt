package br.com.fabiano.boardgames.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.com.fabiano.boardgames.entity.BoardGame

@Dao
interface BoardGameDao {

    @Insert
    suspend fun insert(boardGame: BoardGame)

    @Query("SELECT * FROM boardgames ORDER BY id ASC")
    fun getAllBoardGames(): LiveData<List<BoardGame>>

    @Update
    suspend fun update(boardGame: BoardGame)

    @Delete
    suspend fun delete(boardGame: BoardGame)

}