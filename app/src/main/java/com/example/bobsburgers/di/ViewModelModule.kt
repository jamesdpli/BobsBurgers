package com.example.bobsburgers.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.bobsburgers.ui.viewmodel.CharacterDetailsViewModel
import com.example.bobsburgers.ui.viewmodel.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(CharacterDetailsViewModel::class)
    internal abstract fun characterDetailsViewModel(viewModel: CharacterDetailsViewModel): ViewModel
}