package com.sem.commentslistapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sem.commentslistapp.data.repository.CommentsRepository
import com.sem.commentslistapp.presentation.viewModels.CommentsViewModel
import java.lang.IllegalArgumentException
import javax.inject.Singleton

@Singleton
class CommentsViewModelFactory (private val commentsRepository: CommentsRepository):
    ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CommentsViewModel::class.java)) {
            return CommentsViewModel(commentsRepository) as T
        }

        throw IllegalArgumentException("Unknown")

    }

}