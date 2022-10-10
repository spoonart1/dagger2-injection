package com.spoonart.trial.example2.core.di.component

import com.spoonart.trial.example2.core.base.BaseApplication
import com.spoonart.trial.example2.core.di.module.BaseNetworkModule
import com.spoonart.trial.example2.feature.featureone.di.module.FeatureOneActivityModule
import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(
    modules = [
        AndroidInjectionModule::class,
        FeatureOneActivityModule::class,
        BaseNetworkModule::class
    ]
)
interface BaseComponent {

    fun inject(application: BaseApplication)

}