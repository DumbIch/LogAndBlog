package ru.dumdumbich.logandblog.ui.screen.notes

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import ru.dumdumbich.logandblog.app
import ru.dumdumbich.logandblog.databinding.FragmentNotesBinding
import ru.dumdumbich.logandblog.domain.Note
import ru.dumdumbich.logandblog.ui.base.BaseFragment

/**
 * <h3>LogAndBlog</h3>
 * @File : NotesFragment
 * @description
 * <p>Screen Notes (main)</p>
 * @author DumbIch
 * @date 2023-10-14 15:48
 **/

class NotesFragment : BaseFragment<FragmentNotesBinding>(FragmentNotesBinding::inflate) {

    private lateinit var notesListAdapter: NotesListAdapter

    private val listener = object : NotesItemActionListener {

        override fun onItemShortClickListener(note: Note) {
            Toast.makeText(
                requireContext(),
                "Short click on item: ${note.content}",
                Toast.LENGTH_SHORT
            ).show()
        }

        override fun onItemLongClickListener(note: Note, anchor: View): Boolean {
            Toast.makeText(
                requireContext(),
                "Long click on item: ${note.timestamp}",
                Toast.LENGTH_SHORT
            ).show()
            return true
        }

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        notesListAdapter = NotesListAdapter(
            emptyList<Note>().toMutableList(),
            listener
        )

        ui.notesItemRecyclerView.adapter = notesListAdapter

        showProgressBar()
        notesListAdapter.setData(app.dataCenter.getAllNotes())
        hideProgressBar()

    }

    override fun onDestroy() {
        super.onDestroy()
    }

    private fun showProgressBar() {
        ui.notesListProgressBar.isVisible = true
    }

    private fun hideProgressBar() {
        ui.notesListProgressBar.isVisible = false
    }

}
