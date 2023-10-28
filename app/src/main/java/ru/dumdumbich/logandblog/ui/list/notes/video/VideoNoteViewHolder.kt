package ru.dumdumbich.logandblog.ui.list.notes.video

import ru.dumdumbich.logandblog.databinding.ItemNoteVideoBinding
import ru.dumdumbich.logandblog.ui.list.notes.NoteItem
import ru.dumdumbich.logandblog.ui.list.notes.NoteViewHolder

/**
 * <h3>LogAndBlog</h3>
 * @File : VideoNoteViewHolder
 * @description
 * <p>Video note view holder</p>
 * @author DumbIch
 * @date 2023-10-27 09:40
 **/

class VideoNoteViewHolder(
    private val ui: ItemNoteVideoBinding,
    private val listener: VideoItemActionListener
) : NoteViewHolder(ui.root) {

    override fun bind(item: NoteItem) {
        super.bind(item)
        if (item is VideoNoteItem) {
            ui.noteVideoTimestampTextView.text = item.timestamp
            ui.noteVideoContentTextView.text = item.content
            itemView.setOnClickListener { listener.onItemShortClickListener(item) }
            itemView.setOnLongClickListener { listener.onItemLongClickListener(item, ui.root) }
        } else {
            throw IllegalArgumentException("VideoNoteViewHolder : Item type mismatch")
        }
    }

}
