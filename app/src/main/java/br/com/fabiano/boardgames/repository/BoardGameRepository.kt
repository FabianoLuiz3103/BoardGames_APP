package br.com.fabiano.boardgames.repository

import androidx.lifecycle.LiveData
import br.com.fabiano.boardgames.dao.BoardGameDao
import br.com.fabiano.boardgames.entity.BoardGame

class BoardGameRepository (private val boardGameDao : BoardGameDao) {
    val allBoardGames : LiveData<List<BoardGame>> =
        boardGameDao .getAllBoardGames()
    suspend fun insert(boardGame: BoardGame) {
        boardGameDao .insert(boardGame)
    }
    suspend fun update(boardGame: BoardGame) {
        boardGameDao .update(boardGame)
    }
    suspend fun delete(boardGame: BoardGame) {
        boardGameDao .delete(boardGame)
    }
}