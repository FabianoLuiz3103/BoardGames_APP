package br.com.fabiano.boardgames.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.com.fabiano.boardgames.MainViewModel
import br.com.fabiano.boardgames.repository.BoardGameRepository

class MainViewModelFactory (private val repository:
                            BoardGameRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom( MainViewModel ::class.java)) {
            @Suppress("UNCHECKED_CAST" )
            return MainViewModel( repository) as T
        }
        throw IllegalArgumentException( "Unknown ViewModel class" )
    }
}
