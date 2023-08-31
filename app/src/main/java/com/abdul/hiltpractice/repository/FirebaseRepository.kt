package com.abdul.hiltpractice.repository

import android.util.Log
import com.abdul.hiltpractice.utils.Util

class FirebaseRepository : UserRepository {

    override fun saveUser(email: String, password: String) {
        Log.d(Util.TAG, "User saved in Firebase")
    }
}