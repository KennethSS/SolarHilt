package com.solar.hilt

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor() : ViewModel() {
    private val _textEvent = MutableLiveData<String>()
    val textEvent: LiveData<String> get() = _textEvent

    fun getEventText() {
        _textEvent.value = "Hilt Test Value"
    }
}