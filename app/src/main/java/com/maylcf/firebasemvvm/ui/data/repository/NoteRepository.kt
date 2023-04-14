package com.maylcf.firebasemvvm.ui.data.repository

import com.maylcf.firebasemvvm.ui.data.model.Note
import com.maylcf.firebasemvvm.util.UiState

interface NoteRepository {
    fun getNotes(): UiState<List<Note>>
}