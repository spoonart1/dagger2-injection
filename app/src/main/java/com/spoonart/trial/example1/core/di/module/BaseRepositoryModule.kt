package com.spoonart.trial.example1.core.di.module

import com.spoonart.trial.example1.core.base.BaseRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class BaseRepositoryModule {

    @Singleton
    @Provides
    fun provideRepository() = BaseRepository()

}