package com.example.bobsburgers.di

import com.example.bobsburgers.BobsBurgersActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class BobsBurgerActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeAndroidInjector(): BobsBurgersActivity
}