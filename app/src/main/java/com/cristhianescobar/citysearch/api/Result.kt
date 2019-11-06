package com.cristhianescobar.citysearch.api

/**
 * Represents a result for delivery through LiveData.
 */
sealed class Result<T> {
    data class Success<T>(val data: T) : Result<T>()
    data class Error<T>(val error: Throwable) : Result<T>()
    data class Loading<T>(val data: T? = null) : Result<T>()
}