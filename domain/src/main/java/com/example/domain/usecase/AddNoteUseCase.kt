package com.example.domain.usecase

import com.example.domain.model.Note
import com.example.domain.repository.NoteRepository

class AddNoteUseCase  constructor(private val noteRepository: NoteRepository) {
    suspend fun invoke(note: Note) = noteRepository.insertNote(note)
}