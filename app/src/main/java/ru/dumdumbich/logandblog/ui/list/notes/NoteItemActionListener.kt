package ru.dumdumbich.logandblog.ui.list.notes

import android.view.View

/**
 * <h3>LogAndBlog</h3>
 * @File : NoteItemActionListener
 * @description
 * <p>Base interface for note item action listener</p>
 * @author DumbIch
 * @date 2023-10-27 09:35
 **/

interface NoteItemActionListener {

    fun onItemShortClickListener(note: NoteItem)
    fun onItemLongClickListener(note: NoteItem, anchor: View): Boolean

}
