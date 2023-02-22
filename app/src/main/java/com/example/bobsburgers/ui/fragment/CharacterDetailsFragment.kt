package com.example.bobsburgers.ui.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.bobsburgers.databinding.FragmentCharacterDetailsBinding
import com.example.bobsburgers.ui.viewmodel.CharacterDetailsViewModel
import com.example.bobsburgers.ui.viewmodel.ViewModelFactory
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class CharacterDetailsFragment : Fragment() {

    private var _binding: FragmentCharacterDetailsBinding? = null
    private val binding get() = _binding!!

    @Inject lateinit var viewModelFactory: ViewModelFactory
    private val characterDetailsViewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[CharacterDetailsViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCharacterDetailsBinding.inflate(inflater, container, false)
        val view = binding.root

        characterDetailsViewModel.getCharacterById("9")
        characterDetailsViewModel.characterDetailsLiveData.observe(viewLifecycleOwner) {
            networkCharacter -> binding.testTextView.text = networkCharacter.name
        }

        return view
    }

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}