package com.sem.commentslistapp.presentation.di


import com.sem.commentslistapp.data.repository.CommentsRepository
import dagger.Module
import dagger.Provides

@Module
class CommentsDataModule {

    @Provides
    fun providesNameData(): CommentsRepository {
        return CommentsRepository()
    }

}