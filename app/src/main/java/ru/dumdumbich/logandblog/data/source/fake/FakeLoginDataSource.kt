package ru.dumdumbich.logandblog.data.source.fake

import android.util.Log
import org.ktorm.dsl.eq
import ru.dumdumbich.logandblog.domain.LoggedInUser
import ru.dumdumbich.logandblog.domain.LoginDataSourceUsecase
import ru.dumdumbich.logandblog.domain.RequestResult
import java.io.IOException

/**
 * <h3>LogAndBlog</h3>
 * @File : FakeLoginDataSource
 * @description
 * <p>Fake login data source</p>
 * @author DumbIch
 * @date 2023-12-03 13:33
 **/

class FakeLoginDataSource : LoginDataSourceUsecase {

    private val TAG = "@@@  ${this::class.java.simpleName} : ${this.hashCode()}"

    private val userList = mapOf<String, String>(Pair("user", "123456"), Pair("admin", "654321"))

    override fun login(username: String, password: String): RequestResult<LoggedInUser> {

        try {
            val fakeUser = LoggedInUser(java.util.UUID.randomUUID().toString(), username)
            for (user in userList) {
                if (username.equals(user)) {
                    return RequestResult.Success(fakeUser)
                }
            }
            return RequestResult.Error(IOException("User profile not exist"))
        } catch (e: Throwable) {
            return RequestResult.Error(IOException("Error logging in", e))
        }
    }
    override fun logout() {
        Log.d(TAG, "logout() called")
    }

}