package ru.dumdumbich.logandblog.ui.list.notes.text

import ru.dumdumbich.logandblog.ui.list.notes.NoteItem

/**
 * <h3>LogAndBlog</h3>
 * @File : TextNoteItem
 * @description
 * <p>Text note item</p>
 * @author DumbIch
 * @date 2023-10-27 09:39
 **/

class TextNoteItem(
    override val timestamp: String,
    override val content: String,
    val text: String
) : NoteItem {
}
