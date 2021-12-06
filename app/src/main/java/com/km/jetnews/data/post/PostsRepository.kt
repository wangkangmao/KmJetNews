package com.km.jetnews.data.post

import com.km.jetnews.data.Result
import com.km.jetnews.model.Post
import com.km.jetnews.model.PostFeed
import kotlinx.coroutines.flow.Flow

/**
 * @author: created by wangkm
 * @time: 2021/12/06 23:07
 * @desc：Interface to the Posts data layer.
 * @email: 1240413544@qq.com
 */

interface PostsRepository {

    /**
     * Get a specific JetNews post.
     */
    suspend fun getPost(postId: String?): Result<Post>

    /**
     * Get KmJetNews posts
     */
    suspend fun getPostsFeed(): Result<PostFeed>

    /**
     * Observe the current favorites
     */
    fun observeFavorites(): Flow<Set<String>>

    /**
     * Toggle a postIOd to be a favorite ro not.
     */
    suspend fun toggleFavorite(postId: String)
}