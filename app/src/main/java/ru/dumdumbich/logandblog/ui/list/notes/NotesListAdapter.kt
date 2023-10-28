package ru.dumdumbich.logandblog.ui.list.notes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.dumdumbich.logandblog.databinding.ItemNoteImageBinding
import ru.dumdumbich.logandblog.databinding.ItemNoteTextBinding
import ru.dumdumbich.logandblog.databinding.ItemNoteVideoBinding
import ru.dumdumbich.logandblog.databinding.ItemNoteVoiceBinding
import ru.dumdumbich.logandblog.ui.list.notes.image.ImageItemActionListener
import ru.dumdumbich.logandblog.ui.list.notes.image.ImageNoteItem
import ru.dumdumbich.logandblog.ui.list.notes.image.ImageNoteViewHolder
import ru.dumdumbich.logandblog.ui.list.notes.text.TextItemActionListener
import ru.dumdumbich.logandblog.ui.list.notes.text.TextNoteItem
import ru.dumdumbich.logandblog.ui.list.notes.text.TextNoteViewHolder
import ru.dumdumbich.logandblog.ui.list.notes.video.VideoItemActionListener
import ru.dumdumbich.logandblog.ui.list.notes.video.VideoNoteItem
import ru.dumdumbich.logandblog.ui.list.notes.video.VideoNoteViewHolder
import ru.dumdumbich.logandblog.ui.list.notes.voice.VoiceItemActionListener
import ru.dumdumbich.logandblog.ui.list.notes.voice.VoiceNoteItem
import ru.dumdumbich.logandblog.ui.list.notes.voice.VoiceNoteViewHolder

/**
 * <h3>LogAndBlog</h3>
 * @File : NotesListAdapter
 * @description
 * <p>Notes list adapter</p>
 * @author DumbIch
 * @date 2023-10-27 09:35
 **/

class NotesListAdapter(
    private val data: FakeNotesDataSource,
    private val textListener: NoteItemActionListener,
    private val voiceListener: NoteItemActionListener,
    private val imageListener: NoteItemActionListener,
    private val videoListener: NoteItemActionListener,
) : RecyclerView.Adapter<NoteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder =
        when (viewType) {
            NotesItemType.TEXT.id -> TextNoteViewHolder(
                ItemNoteTextBinding.inflate(
                    LayoutInflater.from(
                        parent.context
                    ), parent, false
                ), textListener as TextItemActionListener
            )

            NotesItemType.VOICE.id -> VoiceNoteViewHolder(
                ItemNoteVoiceBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                ), voiceListener as VoiceItemActionListener
            )

            NotesItemType.IMAGE.id -> ImageNoteViewHolder(
                ItemNoteImageBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                ), imageListener as ImageItemActionListener
            )

            NotesItemType.VIDEO.id -> VideoNoteViewHolder(
                ItemNoteVideoBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                ), videoListener as VideoItemActionListener
            )

            else -> TextNoteViewHolder(
                ItemNoteTextBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                ), textListener as TextItemActionListener
            )
        }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getItemCount(): Int = data.size

    override fun getItemViewType(position: Int): Int = when (data[position]) {
        is TextNoteItem -> NotesItemType.TEXT.id
        is VoiceNoteItem -> NotesItemType.VOICE.id
        is ImageNoteItem -> NotesItemType.IMAGE.id
        is VideoNoteItem -> NotesItemType.VIDEO.id
        else -> NotesItemType.UNDEFINED.id
    }

    private fun getItem(position: Int): NoteItem = data[position]

}
