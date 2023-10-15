package ru.dumdumbich.logandblog

import android.app.Application
import org.koin.core.context.startKoin
import ru.dumdumbich.logandblog.di.appModule

/**
 * <h3>LogAndBlog</h3>
 * @File : App
 * @description
 * <p>Main application class</p>
 * @author DumbIch
 * @date 2023-10-14 14:28
 **/

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule)
        }
    }

}