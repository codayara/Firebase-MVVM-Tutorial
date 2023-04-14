package com.maylcf.firebasemvvm.ui.data.repository

import com.google.firebase.firestore.FirebaseFirestore
import com.maylcf.firebasemvvm.ui.data.model.Note
import com.maylcf.firebasemvvm.util.UiState
import java.util.*

class NoteRepositoryImp(
    val database: FirebaseFirestore
) : NoteRepository {
    override fun getNotes(): UiState<List<Note>> {
        // We will get data from firebase
        val data = arrayListOf(
            Note("id1", "Note 1", Date()),
            Note("id2", "Note 2", Date()),
            Note("id3", "Note 3", Date())
        )

        return if (data.isNullOrEmpty()) {
            UiState.Failure("Data is Empty")
        } else {
            UiState.Success(data)
        }
    }
}