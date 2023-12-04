package ru.dumdumbich.logandblog.domain

/**
 * <h3>LogAndBlog</h3>
 * @File : LoggedInUser
 * @description
 * <p>Data of logged in user</p>
 * @author DumbIch
 * @date 2023-12-03 13:47
 **/

data class LoggedInUser(
    val userId: String,
    val displayName: String
)
