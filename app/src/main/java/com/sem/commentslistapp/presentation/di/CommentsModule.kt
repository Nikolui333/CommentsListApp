package com.sem.commentslistapp.presentation.di

import com.sem.commentslistapp.data.repository.CommentsRepository
import com.sem.commentslistapp.presentation.CommentsViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class CommentsModule {

    @CommentsScope
    @Provides
    fun provideNameViewModelFactory(
        nameData: CommentsRepository
    ): CommentsViewModelFactory {
        return CommentsViewModelFactory(
            nameData
        )
    }

}