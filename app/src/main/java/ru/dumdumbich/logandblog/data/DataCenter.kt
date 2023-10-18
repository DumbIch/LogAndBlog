package ru.dumdumbich.logandblog.data

import ru.dumdumbich.logandblog.data.source.FakeDataSource
import ru.dumdumbich.logandblog.domain.DataCenterUsecase
import ru.dumdumbich.logandblog.domain.Note

/**
 * <h3>LogAndBlog</h3>
 * @File : DataCenter
 * @description
 * <p>App Data center implementation</p>
 * @author DumbIch
 * @date 2023-10-18 12:54
 **/


class DataCenter : DataCenterUsecase {

    private var fake: FakeDataSource = FakeDataSource()

    override fun getAllNotes(): List<Note> {
        return fake.getAllNotes()
    }

}