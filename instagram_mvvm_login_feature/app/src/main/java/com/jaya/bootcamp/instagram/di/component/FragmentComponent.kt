package com.jaya.bootcamp.instagram.di.component

import com.jaya.bootcamp.instagram.di.FragmentScope
import com.jaya.bootcamp.instagram.di.module.FragmentModule
import com.jaya.bootcamp.instagram.ui.dummies.DummiesFragment
import dagger.Component

@FragmentScope
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [FragmentModule::class]
)
interface FragmentComponent {

    fun inject(fragment: DummiesFragment)
}