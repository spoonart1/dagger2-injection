package com.spoonart.trial.multibinding

import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.multibindings.ElementsIntoSet
import dagger.multibindings.IntoSet

@Module
class ModuleCore {

    @Provides
    @Reusable
    fun a() = 1

    @Provides
    @Reusable
    fun b() = true

}

@Module
class ModuleA {

    @Provides
    @IntoSet
    fun provideOneString(a: Int, b: Boolean): String {
        return "ABC"
    }
}

@Module
class ModuleB {
    @Provides
    @ElementsIntoSet
    fun provideSomeStrings(a: Int, b: Boolean): Set<String> {
        return HashSet(listOf("DEF", "GHI"))
    }
}


@Component(modules = [ModuleCore::class, ModuleA::class, ModuleB::class])
interface ModuleComponent {
    fun strings(): Set<String>
}