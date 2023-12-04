package ru.dumdumbich.logandblog.ui.screen.login

import android.util.Patterns
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.dumdumbich.logandblog.R
import ru.dumdumbich.logandblog.domain.LoginDataSourceUsecase
import ru.dumdumbich.logandblog.domain.RequestResult

/**
 * <h3>LogAndBlog</h3>
 * @File : LoginViewModel
 * @description
 * <p>View model of LoginActivity</p>
 * @author DumbIch
 * @date 2023-12-03 13:10
 **/

class LoginViewModel(private val loginDataSource: LoginDataSourceUsecase) : ViewModel() {

    private val _loginViewState = MutableLiveData<LoginViewState>()
    val loginViewState: LiveData<LoginViewState> = _loginViewState

    private val _loginResult = MutableLiveData<LoginResult>()
    val loginResult: LiveData<LoginResult> = _loginResult

    fun login(username: String, password: String) {
        // can be launched in a separate asynchronous job
        val result = loginDataSource.login(username, password)

        if (result is RequestResult.Success) {
            _loginResult.value =
                LoginResult(success = LoggedInUserView(displayName = result.data.displayName))
        } else {
            _loginResult.value = LoginResult(error = R.string.login_failed)
        }
    }

    fun loginDataChanged(username: String, password: String) {
        if (!isUserNameValid(username)) {
            _loginViewState.value = LoginViewState(usernameError = R.string.invalid_username)
        } else if (!isPasswordValid(password)) {
            _loginViewState.value = LoginViewState(passwordError = R.string.invalid_password)
        } else {
            _loginViewState.value = LoginViewState(isDataValid = true)
        }
    }

    // A placeholder username validation check
    private fun isUserNameValid(username: String): Boolean {
        return if (username.contains('@')) {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else {
            username.isNotBlank()
        }
    }

    // A placeholder password validation check
    private fun isPasswordValid(password: String): Boolean {
        return password.length > 5
    }
}