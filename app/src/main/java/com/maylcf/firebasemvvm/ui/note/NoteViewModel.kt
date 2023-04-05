package com.maylcf.firebasemvvm.ui.note

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.maylcf.firebasemvvm.ui.data.model.Note
import com.maylcf.firebasemvvm.ui.data.repository.NoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(private val repository: NoteRepository) : ViewModel() {

    private val _notes = MutableLiveData<List<Note>>()
    val notes: LiveData<List<Note>>
        get() = _notes

    fun getNotes() {
        _notes.value = repository.getNotes()
    }
}