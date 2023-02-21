package com.example.bobsburgers.ui.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.bobsburgers.R
import com.example.bobsburgers.ui.viewmodel.CharacterDetailsViewModel
import com.example.bobsburgers.ui.viewmodel.ViewModelFactory
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class CharacterDetailsFragment : Fragment() {

    @Inject lateinit var viewModelFactory: ViewModelFactory
    private val characterDetailsViewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[CharacterDetailsViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        characterDetailsViewModel.getCharacterById("9")
        characterDetailsViewModel.characterDetailsLiveData.observe(viewLifecycleOwner) {
            Log.d("Hello-Dagger", it.toString())
        }

        return layoutInflater.inflate(R.layout.fragment_character_details, container, false)
    }

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }
}