package com.sem.commentslistapp.presentation.viewModels

import androidx.lifecycle.ViewModel
import com.sem.commentslistapp.data.repository.CommentsRepository

class CommentsViewModel(private val commentsData: CommentsRepository): ViewModel() {

    fun getComments():String{
        return commentsData.getComments()
    }

}