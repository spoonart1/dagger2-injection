package com.spoonart.trial.example2.core.di.module

import com.spoonart.trial.example2.core.base.BaseNetwork
import dagger.Module
import dagger.Provides

@Module
class BaseNetworkModule {
    @Provides
    fun provideNetwork(): BaseNetwork = BaseNetwork()
}