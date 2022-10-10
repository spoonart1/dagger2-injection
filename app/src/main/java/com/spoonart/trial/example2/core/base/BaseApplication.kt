package com.spoonart.trial.example2.core.base

import android.app.Application
import com.spoonart.trial.example2.core.di.component.DaggerBaseComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class BaseApplication : Application(), HasAndroidInjector {

    @Inject
    lateinit var injector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()
        DaggerBaseComponent.create().inject(this)
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return injector
    }
}