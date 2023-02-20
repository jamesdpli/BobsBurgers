package com.example.bobsburgers.di

import com.example.bobsburgers.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainApplicationModule {

    @ContributesAndroidInjector
    abstract fun contributeAndroidInjector(): MainActivity

}