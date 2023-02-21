package com.example.bobsburgers.di

import com.example.bobsburgers.ui.CharacterDetailsFragment
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent
interface CharacterDetailsFragmentSubcomponent: AndroidInjector<CharacterDetailsFragment> {

    @Subcomponent.Factory
    interface Factory: AndroidInjector.Factory<CharacterDetailsFragment>
}