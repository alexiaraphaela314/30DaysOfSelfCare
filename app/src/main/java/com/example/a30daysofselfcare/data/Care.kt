package com.example.a30daysofselfcare.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30daysofselfcare.R

data class Care(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val description: Int
)

val cares = listOf(
    Care(R.drawable.day1, R.string.day1, R.string.day_description_1),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_2),
    Care(R.drawable.day3, R.string.day3, R.string.day_description_3),
    Care(R.drawable.day4, R.string.day4, R.string.day_description_4),
    Care(R.drawable.day5, R.string.day5, R.string.day_description_5),
    Care(R.drawable.day6, R.string.day6, R.string.day_description_6),
    Care(R.drawable.day7, R.string.day7, R.string.day_description_7),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_2),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_2),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_2),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_2),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_2),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_2),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_2),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_2),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_2),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_2),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_2),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_2),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_2),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_2),
    
)