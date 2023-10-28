package ru.dumdumbich.logandblog.domain

/**
 * <h3>LogAndBlog</h3>
 * @File : NoteUsecase
 * @description
 * <p>Notes data source usecase</p>
 * @author DumbIch
 * @date 2023-10-18 11:09
 **/

interface NoteUsecase {
    fun getAllNotes(): List<Note>
}