package ru.dumdumbich.logandblog.ui.screen.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

import ru.dumdumbich.logandblog.data.DataCenter
import ru.dumdumbich.logandblog.domain.LoginDataSourceUsecase

/**
 * <h3>LogAndBlog</h3>
 * @File : LoginViewModelFactory
 * @description
 * <p>Factory of ViewModel class for LoginActivity</p>
 * @author DumbIch
 * @date 2023-12-03 15:29
 **/

class LoginViewModelFactory : ViewModelProvider.Factory {

    private val loginDataSource: LoginDataSourceUsecase by inject()

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            return LoginViewModel(
                loginDataSource = loginDataSource
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}