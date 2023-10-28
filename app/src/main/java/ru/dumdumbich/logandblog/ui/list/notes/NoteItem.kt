package ru.dumdumbich.logandblog.ui.list.notes

/**
 * <h3>LogAndBlog</h3>
 * @File : NoteItem
 * @description
 * <p>Base interface for note item</p>
 * @author DumbIch
 * @date 2023-10-27 09:35
 **/

interface NoteItem {
    val timestamp: String
    val content: String
}
