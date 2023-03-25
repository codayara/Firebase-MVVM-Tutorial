package com.maylcf.firebasemvvm.ui.data.repository

import com.maylcf.firebasemvvm.ui.data.model.Note

class NoteRepositoryImp: NoteRepository {
    override fun getNotes(): List<Note> {
        return arrayListOf()
    }
}