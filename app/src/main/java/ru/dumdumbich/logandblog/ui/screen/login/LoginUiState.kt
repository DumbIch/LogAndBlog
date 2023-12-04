package ru.dumdumbich.logandblog.ui.screen.login

/**
 * <h3>LogAndBlog</h3>
 * @File : LoginViewState
 * @description
 * <p>State of LoginActivity</p>
 * @author DumbIch
 * @date 2023-12-03 13:09
 **/

data class LoginUiState(
    val usernameError: Int? = null,
    val passwordError: Int? = null,
    val isDataValid: Boolean = false
)


/*
sealed class LoginUiState {
    data object UsernameError : LoginUiState()
    data object PasswordError : LoginUiState()
    data object LoginSuccess : LoginUiState()
}
*/
