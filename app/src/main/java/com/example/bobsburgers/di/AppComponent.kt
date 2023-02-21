package com.example.bobsburgers.di

import com.example.bobsburgers.BobsBurgerApplication
import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(
    modules = [
        AndroidInjectionModule::class,
        BobsBurgerActivityModule::class,
        NetworkModule::class,
        CharacterDetailsFragmentModule::class,
        ViewModelModule::class
    ]
)
interface AppComponent {

    fun inject(bobsBurgerApplication: BobsBurgerApplication): BobsBurgerApplication
}