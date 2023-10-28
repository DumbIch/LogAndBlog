package ru.dumdumbich.logandblog.ui.list.notes.text

import ru.dumdumbich.logandblog.databinding.ItemNoteTextBinding
import ru.dumdumbich.logandblog.ui.list.notes.NoteItem
import ru.dumdumbich.logandblog.ui.list.notes.NoteViewHolder

/**
 * <h3>LogAndBlog</h3>
 * @File : TextNoteViewHolder
 * @description
 * <p>Text note view holder</p>
 * @author DumbIch
 * @date 2023-10-27 09:39
 **/

class TextNoteViewHolder(
    private val ui: ItemNoteTextBinding,
    private val listener: TextItemActionListener
) : NoteViewHolder(ui.root) {

    override fun bind(item: NoteItem) {
        super.bind(item)
        if (item is TextNoteItem) {
            ui.noteTextTimestampTextView.text = item.timestamp
            ui.noteTextContentTextView.text = item.content
            itemView.setOnClickListener { listener.onItemShortClickListener(item) }
            itemView.setOnLongClickListener { listener.onItemLongClickListener(item, ui.root) }
        } else {
            throw IllegalArgumentException("TextNoteViewHolder : Item type mismatch")
        }

    }

}
