package com.km.jetnews.data

import java.lang.Exception


/**
 * @author: created by wangkm
 * @time: 2021/12/06 23:09
 * @desc：A generic class that holds a value or an exception
 * @email: 1240413544@qq.com
 */

sealed class Result<out R> {
    data class Success<out T>(val data: T) : Result<T>()
    data class Error(val exception: Exception):Result<Nothing>()
}

fun <T> Result<T>.successOr(fallback: T): T {
    return (this as? Result.Success<T>)?.data ?: fallback
}
