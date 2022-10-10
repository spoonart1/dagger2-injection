package com.spoonart.trial.example2.feature.featureone.di.module

import com.spoonart.trial.example2.feature.featureone.FeatureOneActivity
import com.spoonart.trial.example2.feature.featureone.di.component.FeatureOneActivitySubComponent
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module(subcomponents = [FeatureOneActivitySubComponent::class])
abstract class FeatureOneActivityModule {

    @Binds
    @IntoMap
    @ClassKey(FeatureOneActivity::class)
    abstract fun bindFeatureOneInjectorFactory(factory: FeatureOneActivitySubComponent.Factory): AndroidInjector.Factory<*>

}