package com.sem.commentslistapp.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.sem.commentslistapp.R
import com.sem.commentslistapp.databinding.ActivityMainBinding
import com.sem.commentslistapp.presentation.di.Injector
import com.sem.commentslistapp.presentation.viewModels.CommentsViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    @Inject
    lateinit var factory: CommentsViewModelFactory
    private lateinit var viewModel: CommentsViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        (application as Injector).createNameSubComponent()
            .inject(this)

        viewModel= ViewModelProvider(this,factory)
            .get(CommentsViewModel::class.java)

        binding.resText.text = viewModel.getComments().toString()
    }
}
