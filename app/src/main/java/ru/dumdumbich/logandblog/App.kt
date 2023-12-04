package ru.dumdumbich.logandblog

import android.app.Application
import android.content.Context
import androidx.fragment.app.Fragment
import androidx.lifecycle.AndroidViewModel
import org.koin.core.context.startKoin
import ru.dumdumbich.logandblog.branch.database.data.DataCenter
import ru.dumdumbich.logandblog.di.appModule
import ru.dumdumbich.logandblog.domain.DataCenterUsecase

/**
 * <h3>LogAndBlog</h3>
 * @File : App
 * @description
 * <p>Main application class</p>
 * @author DumbIch
 * @date 2023-10-14 14:28
 **/

class App : Application() {

//    val dataCenter: DataCenterUsecase by lazy { DataCenter() }

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule)
        }
    }

}


val Context.app
    get() = applicationContext as App

val Fragment.app
    get() = requireActivity().app

val AndroidViewModel.app
    get() = getApplication<App>()