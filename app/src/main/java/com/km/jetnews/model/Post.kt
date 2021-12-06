package com.km.jetnews.model

import androidx.annotation.DrawableRes

/**
 * @author: created by wangkm
 * @time: 2021/12/06 23:13
 * @desc：
 * @email: 1240413544@qq.com
 */

data class Post(
    val id: String,
    val title: String,
    val subtitle: String? = null,
    val url: String,
    val publication: Publication? = null,
    val metadata: Metadata,
    val paragraphs: List<Paragraph> = emptyList(),
    @DrawableRes val imageId: Int,
    @DrawableRes val imageThumbId: Int
)

data class Metadata(
    val author: PostAuthor,
    val data: String,
    val readTimeMinutes: Int
)

data class PostAuthor(
    val name: String,
    val url: String? = null
)

data class Publication(
    val name: String,
    val url: String? = null
)

data class Paragraph(
    val type: ParagraphType,
    val text: String,
    val makeups: List<Makeup> = emptyList()
)

data class Makeup(
    val type: MakeupType,
    val start: Int,
    val end: Int,
    val href: String? = null
)

enum class MakeupType {
    Link,
    Code,
    Italic,
    Bold,
}

enum class ParagraphType {
    Title,
    Caption,
    Header,
    Subhead,
    Text,
    CodeBlock,
    Quote,
    Bullet,
}

