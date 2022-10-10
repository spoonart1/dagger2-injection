package com.spoonart.trial.example1.feature.featureone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.spoonart.trial.example1.core.base.BaseApplication
import com.spoonart.trial.example1.feature.featureone.di.component.DaggerFeatureOneComponent

class FeatureOneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerFeatureOneComponent.builder()
            .baseComponent(BaseApplication.baseComponent)
            .build()
            .inject(this)
    }

}