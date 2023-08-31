package com.abdul.hiltpractice.repository

import android.util.Log
import com.abdul.hiltpractice.utils.Util
import javax.inject.Inject


class SQLRepository @Inject constructor() : UserRepository {

    override fun saveUser(email: String, password: String) {
        Log.d(Util.TAG, "User saved in DB")
    }
}