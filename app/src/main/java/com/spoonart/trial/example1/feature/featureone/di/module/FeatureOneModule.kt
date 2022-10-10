package com.spoonart.trial.example1.feature.featureone.di.module

import com.spoonart.trial.example1.feature.featureone.FeatureOneNetwork
import com.spoonart.trial.example1.feature.scope.FeatureOneScope
import dagger.Module
import dagger.Provides

@Module
class FeatureOneModule {

    @Provides
    @FeatureOneScope
    fun provideNetwork() = FeatureOneNetwork()

}