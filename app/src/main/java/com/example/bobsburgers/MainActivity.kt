package com.example.bobsburgers

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.bobsburgers.data.BobsBurgersService
import dagger.android.AndroidInjection
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var service: BobsBurgersService

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        CoroutineScope(Dispatchers.IO).launch {
            Log.d("NETWORK_CALL", service.getCharacter().body()!!.toString())
        }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}