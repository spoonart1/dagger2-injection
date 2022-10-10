package com.spoonart.trial.example1.core.di.module

import com.spoonart.trial.example1.core.base.BaseNetwork
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class BaseNetworkModule {

    @Singleton
    @Provides
    fun provideNetwork() = BaseNetwork()
}