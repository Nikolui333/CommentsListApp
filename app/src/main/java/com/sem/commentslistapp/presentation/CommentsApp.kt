package com.sem.commentslistapp.presentation

import android.app.Application
import com.sem.commentslistapp.presentation.di.AppComponent
import com.sem.commentslistapp.presentation.di.AppModule
import com.sem.commentslistapp.presentation.di.CommentsSubComponent
import com.sem.commentslistapp.presentation.di.Injector

class CommentsApp : Application(), Injector {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
/*        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .build()*/

    }

    override fun createNameSubComponent(): CommentsSubComponent {
        return appComponent.nameSubComponent().create()
    }


}

