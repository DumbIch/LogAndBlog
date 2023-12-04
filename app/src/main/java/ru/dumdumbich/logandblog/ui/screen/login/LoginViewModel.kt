package ru.dumdumbich.logandblog.ui.screen.login

import android.util.Patterns
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
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

    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState: StateFlow<LoginUiState> = _uiState.asStateFlow()

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

}