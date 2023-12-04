package ru.dumdumbich.logandblog.data.source.fake

import ru.dumdumbich.logandblog.domain.Note
import ru.dumdumbich.logandblog.domain.NoteUsecase

/**
 * <h3>LogAndBlog</h3>
 * @File : FakeNoteDataSource
 * @description
 * <p>Fake note data source only for develop</p>
 * @author DumbIch
 * @date 2023-10-18 12:57
 **/
class FakeNoteDataSource : NoteUsecase {

    override fun getAllNotes(): List<Note> {
        return listOf(
            Note("12:00:00 18.10.2023", "Bla bla bla bla"),
            Note("12:05:00 18.10.2023", "Bla bla bla bla"),
            Note("12:10:00 18.10.2023", "Bla bla bla bla"),
            Note("12:15:00 18.10.2023", "Bla bla bla bla"),
            Note("12:20:00 18.10.2023", "Bla bla bla bla"),
            Note("12:25:00 18.10.2023", "Bla bla bla bla"),
            Note("12:30:00 18.10.2023", "Bla bla bla bla"),
            Note("12:35:00 18.10.2023", "Bla bla bla bla"),
            Note("12:40:00 18.10.2023", "Bla bla bla bla"),
            Note("12:45:00 18.10.2023", "Bla bla bla bla"),
            Note("12:50:00 18.10.2023", "Bla bla bla bla"),
            Note("12:55:00 18.10.2023", "Bla bla bla bla"),
        )
    }

}