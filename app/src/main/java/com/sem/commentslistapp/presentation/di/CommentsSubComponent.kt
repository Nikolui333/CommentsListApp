package com.sem.commentslistapp.presentation.di

import com.sem.commentslistapp.presentation.MainActivity
import dagger.Subcomponent

@CommentsScope
@Subcomponent(modules = [CommentsModule::class])
interface CommentsSubComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create():CommentsSubComponent
    }

}