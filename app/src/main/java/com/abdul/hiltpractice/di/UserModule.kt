package com.abdul.hiltpractice.di

import com.abdul.hiltpractice.repository.FirebaseRepository
import com.abdul.hiltpractice.repository.SQLRepository
import com.abdul.hiltpractice.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Named

@InstallIn(ActivityComponent::class)
@Module
class UserModule {

    @Provides
    @SQLQualifier
    fun provideSQLRepository(sqlRepository: SQLRepository): UserRepository {
        return sqlRepository
    }

    @Provides
    @FirebaseQualifier
    fun provideFirebaseRepository(): UserRepository {
        return FirebaseRepository()
    }

  //  @Binds -> Wehen we want to bind an interface with implementation in this case we use @Binds annotation
   /* @Binds
    abstract fun bindsUserRepository(sqlRepository: SQLRepository) : UserRepository*/

}