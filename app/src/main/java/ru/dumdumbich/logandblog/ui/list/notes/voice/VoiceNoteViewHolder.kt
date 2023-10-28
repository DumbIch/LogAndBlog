package ru.dumdumbich.logandblog.ui.list.notes.voice

import ru.dumdumbich.logandblog.databinding.ItemNoteVoiceBinding
import ru.dumdumbich.logandblog.ui.list.notes.NoteItem
import ru.dumdumbich.logandblog.ui.list.notes.NoteViewHolder

/**
 * <h3>LogAndBlog</h3>
 * @File : VoiceNoteViewHolder
 * @description
 * <p>Voice note view holder</p>
 * @author DumbIch
 * @date 2023-10-27 09:41
 **/

class VoiceNoteViewHolder(
    private val ui: ItemNoteVoiceBinding,
    private val listener: VoiceItemActionListener
) : NoteViewHolder(ui.root) {

    override fun bind(item: NoteItem) {
        super.bind(item)
        if (item is VoiceNoteItem) {
            ui.noteVoiceTimestampTextView.text = item.timestamp
            ui.noteVoiceContentTextView.text = item.content
            itemView.setOnClickListener { listener.onItemShortClickListener(item) }
            itemView.setOnLongClickListener { listener.onItemLongClickListener(item, ui.root) }
        } else {
            throw IllegalArgumentException("VoiceNoteViewHolder : Item type mismatch")
        }
    }

}
