package com.jaya.bootcamp.instagram.di.component

import com.jaya.bootcamp.instagram.di.ActivityScope
import com.jaya.bootcamp.instagram.di.module.ActivityModule
import com.jaya.bootcamp.instagram.ui.dummy.DummyActivity
import com.jaya.bootcamp.instagram.ui.splash.SplashActivity
import dagger.Component

@ActivityScope
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [ActivityModule::class]
)
interface ActivityComponent {

    fun inject(activity: SplashActivity)

    fun inject(activity: DummyActivity)
}