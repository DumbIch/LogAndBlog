package ru.dumdumbich.logandblog.ui.list.notes

import ru.dumdumbich.logandblog.ui.list.notes.image.ImageNoteItem
import ru.dumdumbich.logandblog.ui.list.notes.text.TextNoteItem
import ru.dumdumbich.logandblog.ui.list.notes.video.VideoNoteItem
import ru.dumdumbich.logandblog.ui.list.notes.voice.VoiceNoteItem

/**
 * <h3>LogAndBlog</h3>
 * @File : FakeNotesDataSource
 * @description
 * <p>Fake note datasource for testing notes list view</p>
 * @author DumbIch
 * @date 2023-10-27 09:35
 **/

class FakeNotesDataSource {
    operator fun get(position: Int): NoteItem = items[position]

    private val items: List<NoteItem> = listOf(
        TextNoteItem("12:00:00 25.10.2023", "Text Note Item 1", "TEXT"),
        TextNoteItem("12:00:00 25.10.2023", "Text Note Item 2", "TEXT"),
        VoiceNoteItem("12:00:00 25.10.2023", "VOICE Note Item 3"),
        TextNoteItem("12:00:00 25.10.2023", "Text Note Item 4", "TEXT"),
        TextNoteItem("12:00:00 25.10.2023", "Text Note Item 5", "TEXT"),
        ImageNoteItem("12:00:00 25.10.2023", "IMAGE Note Item 6"),
        TextNoteItem("12:00:00 25.10.2023", "Text Note Item 7", "TEXT"),
        TextNoteItem("12:00:00 25.10.2023", "Text Note Item 8", "TEXT"),
        TextNoteItem("12:00:00 25.10.2023", "Text Note Item 9", "TEXT"),
        VideoNoteItem("12:00:00 25.10.2023", "VIDEO Note Item 10"),
        TextNoteItem("12:00:00 25.10.2023", "Text Note Item 11", "TEXT"),
        TextNoteItem("12:00:00 25.10.2023", "Text Note Item 12", "TEXT"),
        TextNoteItem("12:00:00 25.10.2023", "Text Note Item 13", "TEXT"),
        TextNoteItem("12:00:00 25.10.2023", "Text Note Item 14", "TEXT"),
        TextNoteItem("12:00:00 25.10.2023", "Text Note Item 15", "TEXT"),
        VoiceNoteItem("12:00:00 25.10.2023", "VOICE Note Item 16"),
        TextNoteItem("12:00:00 25.10.2023", "Text Note Item 17", "TEXT"),
        TextNoteItem("12:00:00 25.10.2023", "Text Note Item 18", "TEXT"),
        ImageNoteItem("12:00:00 25.10.2023", "IMAGE Note Item 19"),
        TextNoteItem("12:00:00 25.10.2023", "Text Note Item 20", "TEXT"),
        TextNoteItem("12:00:00 25.10.2023", "Text Note Item 21", "TEXT"),
        TextNoteItem("12:00:00 25.10.2023", "Text Note Item 22", "TEXT"),
        VideoNoteItem("12:00:00 25.10.2023", "VIDEO Note Item 23"),
        TextNoteItem("12:00:00 25.10.2023", "Text Note Item 24", "TEXT"),
        TextNoteItem("12:00:00 25.10.2023", "Text Note Item 25", "TEXT"),
        TextNoteItem("12:00:00 25.10.2023", "Text Note Item 26", "TEXT"),
    )

    val size: Int
        get() = items.size

}
