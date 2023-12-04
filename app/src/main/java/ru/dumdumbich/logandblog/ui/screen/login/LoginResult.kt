package ru.dumdumbich.logandblog.ui.screen.login

/**
 * <h3>LogAndBlog</h3>
 * @File : LoginResult
 * @description
 * <p>Result of LoginActivity</p>
 * @author DumbIch
 * @date 2023-12-03 13:13
 **/
data class LoginResult(
    val success: LoggedInUserView? = null,
    val error: Int? = null
)
