package com.km.jetnews.model

/**
 * @author: created by wangkm
 * @time: 2021/12/06 23:23
 * @desc：A container of [Post]s, partitioned into different categories.
 * @email: 1240413544@qq.com
 */

class PostFeed(
    private val highlightedPost: Post,
    private val recommendedPosts: List<Post>,
    private val popularPosts: List<Post>,
    var recentPosts: List<Post>,
) {

    val allPost: List<Post> = listOf(highlightedPost) + recommendedPosts +
            popularPosts + recentPosts
}