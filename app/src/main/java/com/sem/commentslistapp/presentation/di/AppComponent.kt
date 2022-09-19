package com.sem.commentslistapp.presentation.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class,
    CommentsDataModule::class
])
interface AppComponent {

    fun nameSubComponent():CommentsSubComponent.Factory

}
