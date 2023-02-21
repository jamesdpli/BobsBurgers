package com.example.bobsburgers.di

import com.example.bobsburgers.ui.fragment.CharacterDetailsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector
@Module
abstract class CharacterDetailsFragmentModule {

    @ContributesAndroidInjector
    abstract fun contributeAndroidInjector(): CharacterDetailsFragment
}