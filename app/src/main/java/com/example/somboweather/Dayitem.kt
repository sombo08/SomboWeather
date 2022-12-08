package com.example.somboweather

import java.util.concurrent.locks.Condition

data class Dayitem(
    val city: String,
    val time: String,
    val condition: String,
    val imageUrl: String,
    val currentTemp: String,
    val maxTemp: String,
    val minTemp: String,
    val hours: String
)
