package ru.dumdumbich.logandblog.ui.screen.notes

import android.os.Bundle
import android.util.Log
import android.view.View
import ru.dumdumbich.logandblog.databinding.FragmentNotesBinding
import ru.dumdumbich.logandblog.ui.base.BaseFragment
import ru.dumdumbich.logandblog.ui.list.notes.NoteItem
import ru.dumdumbich.logandblog.ui.list.notes.FakeNotesDataSource
import ru.dumdumbich.logandblog.ui.list.notes.NotesListAdapter
import ru.dumdumbich.logandblog.ui.list.notes.image.ImageItemActionListener
import ru.dumdumbich.logandblog.ui.list.notes.text.TextItemActionListener
import ru.dumdumbich.logandblog.ui.list.notes.video.VideoItemActionListener
import ru.dumdumbich.logandblog.ui.list.notes.voice.VoiceItemActionListener

/**
 * <h3>LogAndBlog</h3>
 * @File : NotesFragment
 * @description
 * <p>Screen Notes (main)</p>
 * @author DumbIch
 * @date 2023-10-14 15:48
 **/

class NotesFragment : BaseFragment<FragmentNotesBinding>(FragmentNotesBinding::inflate) {

//    var _notesListAdapter: NotesListAdapter? = null
//    val notesListAdapter = _notesListAdapter!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textItemActionListener = object : TextItemActionListener {
            override fun onItemShortClickListener(note: NoteItem) {
                Log.d(TAG, "textItemActionListener.onItemShortClickListener")
            }

            override fun onItemLongClickListener(note: NoteItem, anchor: View): Boolean {
                Log.d(TAG, "textItemActionListener.onItemLongClickListener")
                return true
            }

        }

        val voiceItemActionListener = object : VoiceItemActionListener {
            override fun onItemShortClickListener(note: NoteItem) {
                Log.d(TAG, "voiceItemActionListener.onItemShortClickListener")
            }

            override fun onItemLongClickListener(note: NoteItem, anchor: View): Boolean {
                Log.d(TAG, "voiceItemActionListener.onItemLongClickListener")
                return true
            }

        }

        val imageItemActionListener = object : ImageItemActionListener {
            override fun onItemShortClickListener(note: NoteItem) {
                Log.d(TAG, "imageItemActionListener.onItemShortClickListener")
            }

            override fun onItemLongClickListener(note: NoteItem, anchor: View): Boolean {
                Log.d(TAG, "imageItemActionListener.onItemLongClickListener")
                return true
            }

        }

        val videoItemActionListener = object : VideoItemActionListener {
            override fun onItemShortClickListener(note: NoteItem) {
                Log.d(TAG, "videoItemActionListener.onItemShortClickListener")
            }

            override fun onItemLongClickListener(note: NoteItem, anchor: View): Boolean {
                Log.d(TAG, "videoItemActionListener.onItemLongClickListener")
                return true
            }

        }


        ui.notesList.notesListRecyclerView.adapter = NotesListAdapter(
            FakeNotesDataSource(),
            textItemActionListener,
            voiceItemActionListener,
            imageItemActionListener,
            videoItemActionListener
        )

        //showProgressBar()

        //hideProgressBar()

    }

    override fun onDestroy() {
        super.onDestroy()
//        _notesListAdapter = null
    }

    private fun showProgressBar() {
//        ui.notesList.notesListProgressBar.isVisible = true
    }

    private fun hideProgressBar() {
//        ui.notesList.notesListProgressBar.isVisible = false
    }

}
