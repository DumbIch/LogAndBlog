package ru.dumdumbich.logandblog.ui.list.notes.image

import ru.dumdumbich.logandblog.ui.list.notes.NoteItem

/**
 * <h3>LogAndBlog</h3>
 * @File : ImageNoteItem
 * @description
 * <p>Image note item</p>
 * @author DumbIch
 * @date 2023-10-27 09:38
 **/

class ImageNoteItem(
    override val timestamp: String,
    override val content: String
) : NoteItem {
}
