package com.spoonart.trial

import com.spoonart.trial.multibinding.DaggerModuleComponent
import org.junit.Test

class ExampleUnitTest {

    @Test
    fun testComponent() {
        val component = DaggerModuleComponent.create()
        assert(component.strings().containsAll(listOf("ABC", "DEF", "GHI")))
    }

}