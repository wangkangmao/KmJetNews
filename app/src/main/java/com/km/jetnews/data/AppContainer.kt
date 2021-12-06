package com.km.jetnews.data

import android.content.Context
import com.km.jetnews.data.interests.InterestsRepository
import com.km.jetnews.data.post.PostsRepository

/**
 * @author: created by wangkm
 * @time: 2021/12/06 23:06
 * @desc：Dependency Injection container at the application level.
 * @email: 1240413544@qq.com
 */

/**
 * Dependency Injection container at the application level.
 */
interface AppContainer {
    val postsRepository: PostsRepository
    val interestsRepository:InterestsRepository
}

/**
 * Implementation for the Dependency Injection container at application level.
 *
 * Variable are initialized lazily and the same instance is shared across the whole app.
 */
class AppContainerImpl(private val applicationContext: Context):AppContainer{

    override val postsRepository: PostsRepository
        get() = TODO("Not yet implemented")

    override val interestsRepository: InterestsRepository
        get() = TODO("Not yet implemented")

}
