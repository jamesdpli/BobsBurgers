package com.example.bobsburgers.di

import com.example.bobsburgers.BaseApplication
import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(modules = [AndroidInjectionModule::class, MainApplicationModule::class])
interface AppComponent {

    fun inject(baseApplication: BaseApplication): BaseApplication

}