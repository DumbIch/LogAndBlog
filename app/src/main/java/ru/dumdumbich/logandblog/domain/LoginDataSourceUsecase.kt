package ru.dumdumbich.logandblog.domain

/**
 * <h3>LogAndBlog</h3>
 * @File : LoginDataSourceUsecase
 * @description
 * <p>Interface of login data source</p>
 * @author DumbIch
 * @date 2023-12-03 13:32
 **/


interface LoginDataSourceUsecase {
    fun login(username: String, password: String): RequestResult<LoggedInUser>
    fun logout()
}