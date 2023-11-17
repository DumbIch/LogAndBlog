package ru.dumdumbich.logandblog.branch.database.data.source

import ru.dumdumbich.logandblog.domain.DataCenterUsecase
import ru.dumdumbich.logandblog.domain.Note

/**
 * <h3>LogAndBlog</h3>
 * @File : FakeDataSource
 * @description
 * <p>Fake data source only for develop</p>
 * @author DumbIch
 * @date 2023-10-18 12:57
 **/
class FakeDataSource : DataCenterUsecase {


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