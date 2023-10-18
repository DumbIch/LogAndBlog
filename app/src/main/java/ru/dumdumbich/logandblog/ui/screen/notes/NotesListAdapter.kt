package ru.dumdumbich.logandblog.ui.screen.notes

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.dumdumbich.logandblog.databinding.RecyclerviewItemBinding
import ru.dumdumbich.logandblog.domain.Note

class NotesListAdapter(
    private var data: List<Note>,
    private val listener: NotesItemActionListener
) : RecyclerView.Adapter<NoteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder =
        NoteViewHolder(
            RecyclerviewItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            listener
        )

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData(data: List<Note>) {
        this.data = data
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = data.size

    private fun getItem(position: Int): Note = data[position]

}