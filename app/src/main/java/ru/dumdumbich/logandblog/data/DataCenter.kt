package ru.dumdumbich.logandblog.data

import ru.dumdumbich.logandblog.branch.database.data.source.FakeDataSource
import ru.dumdumbich.logandblog.domain.DataCenterUsecase
import ru.dumdumbich.logandblog.domain.LoggedInUser
import ru.dumdumbich.logandblog.domain.Note
import ru.dumdumbich.logandblog.domain.RequestResult

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

    override fun login(username: String, password: String): RequestResult<LoggedInUser> {
        TODO("Not yet implemented")
    }

    override fun logout() {
        TODO("Not yet implemented")
    }

}