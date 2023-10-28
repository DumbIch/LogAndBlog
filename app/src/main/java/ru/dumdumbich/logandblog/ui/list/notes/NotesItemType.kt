package ru.dumdumbich.logandblog.ui.list.notes

/**
 * <h3>LogAndBlog</h3>
 * @File : NotesItemType
 * @description
 * <p>Type of notes item</p>
 * @author DumbIch
 * @date 2023-10-27 06:15
 **/

enum class NotesItemType(val id: Int) {
    UNDEFINED(0),
    TEXT(1),
    VOICE(2),
    IMAGE(3),
    VIDEO(4)
}
