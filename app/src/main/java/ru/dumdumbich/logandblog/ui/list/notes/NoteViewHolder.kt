package ru.dumdumbich.logandblog.ui.list.notes

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * <h3>LogAndBlog</h3>
 * @File : NoteViewHolder
 * @description
 * <p>Base class of note view holder</p>
 * @author DumbIch
 * @date 2023-10-27 09:35
 **/

abstract class NoteViewHolder(
    itemView: View
) : RecyclerView.ViewHolder(itemView) {

    protected val TAG = "@@@  ${this::class.java.simpleName} : ${this.hashCode()}"

    protected var item: NoteItem? = null

    open fun bind(item: NoteItem) {
        this.item = item
        Log.d(TAG, "bind() called with: item = $item")
    }

}
