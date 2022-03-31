package dev.jimmy.restaurant_ordering.presentation

import okhttp3.ResponseBody

sealed class State<out T> {

    data class Success<out T>(val value: T) : State<T>()

    data class Failure(
        val errorCode: Int?,
        val errorBody: ResponseBody?
    ) : State<Nothing>()

    object Loading : State<Nothing>()
}