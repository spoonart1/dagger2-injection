package com.spoonart.trial.example2.feature.featureone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.spoonart.trial.example2.core.base.BaseNetwork
import dagger.android.AndroidInjection
import javax.inject.Inject

class FeatureOneActivity : AppCompatActivity() {

    @Inject
    lateinit var network: BaseNetwork

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

}