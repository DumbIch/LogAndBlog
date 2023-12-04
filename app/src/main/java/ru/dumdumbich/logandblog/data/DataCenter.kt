package ru.dumdumbich.logandblog.data

import ru.dumdumbich.logandblog.data.source.fake.FakeLoginDataSource
import ru.dumdumbich.logandblog.data.source.fake.FakeNoteDataSource
import ru.dumdumbich.logandblog.domain.LoggedInUser
import ru.dumdumbich.logandblog.domain.LoginDataSourceUsecase
import ru.dumdumbich.logandblog.domain.Note
import ru.dumdumbich.logandblog.domain.NoteDataSourceUsecase
import ru.dumdumbich.logandblog.domain.RequestResult


/**
 * <h3>LogAndBlog</h3>
 * @File : DataCenter
 * @description
 * <p>App Data center implementation</p>
 * @author DumbIch
 * @date 2023-10-18 12:54
 **/


class DataCenter : NoteDataSourceUsecase, LoginDataSourceUsecase {

    private var loginDataSource: LoginDataSourceUsecase = FakeLoginDataSource()
    private var noteDataSource: NoteDataSourceUsecase = FakeNoteDataSource()

    override fun getAllNotes(): List<Note> {
        return noteDataSource.getAllNotes()
    }

    override fun login(username: String, password: String): RequestResult<LoggedInUser> {
        return loginDataSource.login(username, password)
    }

    override fun logout() {
        loginDataSource
    }

}