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
    Care(R.drawable.day2, R.string.day2, R.string.day_description_8),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_9),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_10),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_11),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_12),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_13),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_14),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_15),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_16),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_17),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_18),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_19),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_20),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_21),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_22),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_23),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_24),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_25),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_26),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_27),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_28),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_29),
    Care(R.drawable.day2, R.string.day2, R.string.day_description_30)
)