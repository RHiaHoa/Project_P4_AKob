package com.example.application_v2.Register

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.application_v2.database.UserDatabaseDao

class RegisterViewModelFactory(
    private val dataSource: UserDatabaseDao,
    private val application: Application
):ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RegisterViewModel::class.java)){
            return RegisterViewModel(dataSource,application)    as T
        }else{
            throw IllegalAccessException("unknow view model class")
        }

    }
}