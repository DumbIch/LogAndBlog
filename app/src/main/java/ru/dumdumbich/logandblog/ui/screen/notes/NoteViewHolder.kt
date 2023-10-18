package ru.dumdumbich.logandblog.ui.screen.notes

import android.annotation.SuppressLint
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import ru.dumdumbich.logandblog.databinding.RecyclerviewItemBinding
import ru.dumdumbich.logandblog.domain.Note

class NoteViewHolder(
    private val ui: RecyclerviewItemBinding,
    private val listener: NotesItemActionListener
) : RecyclerView.ViewHolder(ui.root) {

    private val TAG = "@@@  ${this::class.java.simpleName} : ${this.hashCode()}"

    private var item: Note? = null


    @SuppressLint("SetTextI18n")
    fun bind(item: Note) {
        this.item = item
        ui.itemTimestampTextView.text = item.timestamp
        ui.itemContentTextView.text = item.content
        itemView.setOnClickListener { listener.onItemShortClickListener(item) }
        itemView.setOnLongClickListener { listener.onItemLongClickListener(item, ui.root) }
        Log.d(TAG, "bind() called with: item = {${item.timestamp} : ${item.content}}")
    }

}