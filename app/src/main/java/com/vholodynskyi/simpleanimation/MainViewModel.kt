package com.vholodynskyi.simpleanimation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    val progress = MutableLiveData<Float>()
    init {
        progress.value=0.9f
    }
}