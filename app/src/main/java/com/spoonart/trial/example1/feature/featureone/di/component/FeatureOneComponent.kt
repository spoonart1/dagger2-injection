package com.spoonart.trial.example1.feature.featureone.di.component

import com.spoonart.trial.example1.core.di.component.BaseComponent
import com.spoonart.trial.example1.feature.featureone.di.module.FeatureOneModule
import com.spoonart.trial.example1.feature.scope.FeatureOneScope
import com.spoonart.trial.example1.feature.featureone.FeatureOneActivity
import dagger.Component

@Component(
    dependencies = [BaseComponent::class],
    modules = [FeatureOneModule::class]
)
@FeatureOneScope
interface FeatureOneComponent {
    fun inject(featureOneActivity: FeatureOneActivity)
}