package ru.dumdumbich.logandblog.ui.list.notes.video

import ru.dumdumbich.logandblog.ui.list.notes.NoteItem

/**
 * <h3>LogAndBlog</h3>
 * @File : VideoNoteItem
 * @description
 * <p>Video note item</p>
 * @author DumbIch
 * @date 2023-10-27 09:40
 **/

class VideoNoteItem(
    override val timestamp: String,
    override val content: String
) : NoteItem {
}
