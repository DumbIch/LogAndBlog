package ru.dumdumbich.logandblog.ui.screen.notes

import android.view.View
import ru.dumdumbich.logandblog.domain.Note

interface NotesItemActionListener {
    fun onItemShortClickListener(note: Note)
    fun onItemLongClickListener(note: Note, anchor: View): Boolean
}