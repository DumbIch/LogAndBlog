package ru.dumdumbich.logandblog.ui.list.notes.image

import ru.dumdumbich.logandblog.databinding.ItemNoteImageBinding
import ru.dumdumbich.logandblog.ui.list.notes.NoteItem
import ru.dumdumbich.logandblog.ui.list.notes.NoteViewHolder

/**
 * <h3>LogAndBlog</h3>
 * @File : ImageNoteViewHolder
 * @description
 * <p>Image note view holder</p>
 * @author DumbIch
 * @date 2023-10-27 09:38
 **/

class ImageNoteViewHolder(
    private val ui: ItemNoteImageBinding,
    private val listener: ImageItemActionListener
) : NoteViewHolder(ui.root) {

    override fun bind(item: NoteItem) {
        super.bind(item)
        if (item is ImageNoteItem) {
            ui.noteImageTimestampTextView.text = item.timestamp
            ui.noteImageContentTextView.text = item.content
            itemView.setOnClickListener { listener.onItemShortClickListener(item) }
            itemView.setOnLongClickListener { listener.onItemLongClickListener(item, ui.root) }
        } else {
            throw IllegalArgumentException("ImageNoteViewHolder : Item type mismatch")
        }
    }

}
