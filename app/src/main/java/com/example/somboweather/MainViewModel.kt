package com.example.somboweather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.somboweather.adapters.WeatherModel

class MainViewModel : ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}