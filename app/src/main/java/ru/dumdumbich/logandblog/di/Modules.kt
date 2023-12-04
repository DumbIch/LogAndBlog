package ru.dumdumbich.logandblog.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import ru.dumdumbich.logandblog.data.DataCenter
import ru.dumdumbich.logandblog.domain.LoginDataSourceUsecase
import ru.dumdumbich.logandblog.domain.NoteDataSourceUsecase
import ru.dumdumbich.logandblog.ui.screen.login.LoginUiState
import ru.dumdumbich.logandblog.ui.screen.login.LoginViewModel

/**
 * <h3>LogAndBlog</h3>
 * @File : Modules
 * @description
 * <p>Koin dependency injection</p>
 * @author DumbIch
 * @date 2023-10-14 14:32
 **/

enum class KoinKey {
    NOTE_DATA_SOURCE,
    LOGIN_DATA_SOURCE,
    LOGIN_VIEW_MODEL
}

val appModule = module {
    single<NoteDataSourceUsecase>(named(KoinKey.NOTE_DATA_SOURCE)) { DataCenter() }
    single<LoginDataSourceUsecase>(named(KoinKey.LOGIN_DATA_SOURCE)) { DataCenter() }
    viewModel(named(KoinKey.LOGIN_VIEW_MODEL)) { LoginViewModel(get(named(KoinKey.LOGIN_DATA_SOURCE)) )}
}

val uiModule = module {

    scope(named("login_screen")) {
        scoped {
            LoginUiState()
        }
    }
}
