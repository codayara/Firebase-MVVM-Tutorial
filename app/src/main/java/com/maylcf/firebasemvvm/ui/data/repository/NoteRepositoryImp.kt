package com.maylcf.firebasemvvm.ui.data.repository

import com.google.firebase.firestore.FirebaseFirestore
import com.maylcf.firebasemvvm.ui.data.model.Note

class NoteRepositoryImp(
    val database: FirebaseFirestore
): NoteRepository {
    override fun getNotes(): List<Note> {
        return arrayListOf()
    }
}