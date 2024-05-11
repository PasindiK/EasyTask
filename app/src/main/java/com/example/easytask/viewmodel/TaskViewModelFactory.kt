package com.example.easytask.viewmodel

import android.app.Application
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.easytask.repository.TaskRepository

class TaskViewModelFactory(val app: Application , private val taskRepository: TaskRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T{
        return TaskViewModel(app, taskRepository) as T
    }
}