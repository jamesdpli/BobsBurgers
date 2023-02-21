package com.example.bobsburgers.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bobsburgers.data.BobsBurgersRepository
import com.example.bobsburgers.data.response.NetworkCharacter
import kotlinx.coroutines.launch
import javax.inject.Inject

class CharacterDetailsViewModel @Inject constructor(private val repository: BobsBurgersRepository) :
    ViewModel() {

    private val _characterDetailsLiveData = MutableLiveData<NetworkCharacter>()
    val characterDetailsLiveData: LiveData<NetworkCharacter> = _characterDetailsLiveData

    fun getCharacterById(id: String) {
        viewModelScope.launch {
            val response = repository.getCharacterById(id).body()
            _characterDetailsLiveData.postValue(response)
        }
    }

}