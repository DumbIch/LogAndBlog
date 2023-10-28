package ru.dumdumbich.logandblog.ui.list.notes.voice

import ru.dumdumbich.logandblog.ui.list.notes.NoteItem

/**
 * <h3>LogAndBlog</h3>
 * @File : VoiceNoteItem
 * @description
 * <p>Voice note item</p>
 * @author DumbIch
 * @date 2023-10-27 09:41
 **/

class VoiceNoteItem(
    override val timestamp: String,
    override val content: String
) : NoteItem {
}
