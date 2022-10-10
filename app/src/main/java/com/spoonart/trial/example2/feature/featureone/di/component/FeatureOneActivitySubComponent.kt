package com.spoonart.trial.example2.feature.featureone.di.component

import com.spoonart.trial.example2.feature.featureone.FeatureOneActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent
interface FeatureOneActivitySubComponent : AndroidInjector<FeatureOneActivity> {
    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<FeatureOneActivity>

}