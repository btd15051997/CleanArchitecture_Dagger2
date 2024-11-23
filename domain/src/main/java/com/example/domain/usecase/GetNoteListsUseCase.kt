package com.example.domain.usecase

import com.example.domain.repository.NoteRepository
import javax.inject.Inject

class GetNoteListsUseCase @Inject constructor (private val noteRepository: NoteRepository) {
    suspend fun invoke() = noteRepository.getNotes()
}