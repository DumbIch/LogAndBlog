package ru.dumdumbich.logandblog.branch.database

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
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
            androidLogger()
            androidContext(this@App)
            androidFileProperties()
            modules(appModule)
        }
    }

}
