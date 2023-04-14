package com.maylcf.firebasemvvm.ui.note

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.maylcf.firebasemvvm.databinding.FragmentNoteListBinding
import com.maylcf.firebasemvvm.util.UiState
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NoteListFragment : Fragment() {

    val TAG = "NoteListFragment"
    lateinit var binding: FragmentNoteListBinding
    val viewModel: NoteViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNoteListBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getNotes()
        viewModel.notes.observe(viewLifecycleOwner) { state ->
            when (state) {
                is UiState.Loading -> {
                    Log.e(TAG, "Loading")
                }
                is UiState.Failure -> {
                    Log.e(TAG, state.error.toString())
                }
                is UiState.Success -> {
                    state.data.forEach {
                        Log.e(TAG, it.toString())
                    }
                }
            }
        }
    }
}