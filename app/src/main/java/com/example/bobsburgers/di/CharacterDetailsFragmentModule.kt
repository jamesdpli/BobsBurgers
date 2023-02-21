package com.example.bobsburgers.di

import com.example.bobsburgers.ui.CharacterDetailsFragment
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module(subcomponents = [CharacterDetailsFragmentSubcomponent::class])
abstract class CharacterDetailsFragmentModule {

    @Binds
    @IntoMap
    @ClassKey(CharacterDetailsFragment::class)
    abstract fun bindCharacterDetailsFragmentInjectorFactory(factory: CharacterDetailsFragmentSubcomponent.Factory): AndroidInjector.Factory<*>?
}