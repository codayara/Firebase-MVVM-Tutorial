package com.maylcf.firebasemvvm.ui.data.repository

import com.maylcf.firebasemvvm.ui.data.model.Note

interface NoteRepository {
    fun getNotes(): List<Note>
}