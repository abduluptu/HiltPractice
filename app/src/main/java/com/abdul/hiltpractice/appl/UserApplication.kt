package com.abdul.hiltpractice.appl

import android.app.Application
import com.abdul.hiltpractice.repository.UserRepository
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class UserApplication : Application(){  //Note: This class is used to create code for Dagger

    //Field injection
    /*@Inject
    lateinit var userRepository: UserRepository

    override fun onCreate() {
        super.onCreate()

        userRepository.saveUser("test@gmail.com", "111111")
    }*/
}
