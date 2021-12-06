package com.km.jetnews.data.interests

import com.km.jetnews.data.Result
import kotlinx.coroutines.flow.Flow

/**
 * @author: created by wangkm
 * @time: 2021/12/07 07:23
 * @desc：Interface to the Interests data layer
 * @email: 1240413544@qq.com
 */

data class InterestSection(val title:String,val interests:List<String>)

data class TopicSelection(val section:String,val top:String)

interface InterestsRepository {

    /**
     * Get relevant topics to the user.
     */
    suspend fun getTopics():Result<List<InterestSection>>

    /**
     * Get list of people
     */
    suspend fun getPeople():Result<List<String>>

    /**
     * Get list of publications
     */
    suspend fun getPublications():Result<List<String>>

    /**
     * Toggle between selected and unselected
     */
    suspend fun toggleTopicSelection(topic:TopicSelection)

    /**
     * Toggle between selected and unselected
     */
    suspend fun togglePersonSelected(person:String)

    /**
     * Toggle between selected and unselected
     */
    suspend fun togglePublicationSelected(publication: String)

    /**
     * Currently selected topics
     */
    fun observeTopicsSelected():Flow<Set<TopicSelection>>

    /**
     * Currently selected topics
     */
    fun observePeopleSelected():Flow<Set<String>>


    /**
     * Currently selected topics
     */
    fun observePublicationSelected():Flow<Set<String>>






}