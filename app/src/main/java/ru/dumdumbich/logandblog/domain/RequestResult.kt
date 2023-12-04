package ru.dumdumbich.logandblog.domain

/**
 * <h3>LogAndBlog</h3>
 * @File : RequestResult
 * @description
 * <p>Result of any request</p>
 * @author DumbIch
 * @date 2023-12-03 13:37
 **/

sealed class RequestResult<out T : Any> {

    data class Success<out T : Any>(val data: T) : RequestResult<T>()
    data class Error(val exception: Exception) : RequestResult<Nothing>()

    override fun toString(): String {
        return when (this) {
            is Success<*> -> "Success[data=$data]"
            is Error -> "Error[exception=$exception]"
        }
    }
}