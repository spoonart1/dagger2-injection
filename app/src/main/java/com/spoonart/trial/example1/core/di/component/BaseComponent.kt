package com.spoonart.trial.example1.core.di.component

import com.spoonart.trial.example1.core.base.BaseNetwork
import com.spoonart.trial.example1.core.base.BaseRepository
import com.spoonart.trial.example1.core.di.module.BaseNetworkModule
import com.spoonart.trial.example1.core.di.module.BaseRepositoryModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        BaseNetworkModule::class,
        BaseRepositoryModule::class
    ]
)
interface BaseComponent {
    val baseNetwork: BaseNetwork
    val baseRepository: BaseRepository
}