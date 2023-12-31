package com.mr_17.vidconnect.ui.home

import com.mr_17.vidconnect.data.Resource
import com.mr_17.vidconnect.ui.home.models.LatestEvent
import com.mr_17.vidconnect.ui.home.models.User

interface HomeRepository {
    suspend fun getAllUserData() : Resource<List<User>>?
    fun sendMessageToOtherClient(latestEvent: LatestEvent)
    suspend fun subscribeForLatestEvent(listener: HomeRepositoryImpl.Listener)
    suspend fun sendConnectionRequest(targetId: String, isVideoCall: Boolean)
}