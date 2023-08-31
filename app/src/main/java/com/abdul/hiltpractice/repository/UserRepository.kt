package com.abdul.hiltpractice.repository

interface UserRepository {

    fun saveUser(email: String, password: String)
}