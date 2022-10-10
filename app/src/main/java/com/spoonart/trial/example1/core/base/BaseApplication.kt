package com.spoonart.trial.example1.core.base

import android.app.Application
import com.spoonart.trial.example1.core.di.component.DaggerBaseComponent

class BaseApplication : Application() {
    companion object {
        val baseComponent by lazy {
            DaggerBaseComponent.create()
        }
    }
}