package br.com.fabiano.boardgames

import android.app.Application
import br.com.fabiano.boardgames.database.BoardGameDatabase
import br.com.fabiano.boardgames.repository.BoardGameRepository

class BoardGameApplication : Application() {
    val database by lazy { BoardGameDatabase .getDatabase( this) }
    val repository by lazy {
        BoardGameRepository( database.boardGameDao()) }
}