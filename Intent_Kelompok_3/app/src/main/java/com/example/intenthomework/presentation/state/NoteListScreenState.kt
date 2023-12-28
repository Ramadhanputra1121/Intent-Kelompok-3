package com.example.intenthomework.presentation.state

import com.example.intenthomework.domain.Notes

data class NoteListScreenState(var list: List<Notes> = emptyList())
