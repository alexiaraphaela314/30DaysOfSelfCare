package com.example.a30daysofselfcare.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30daysofselfcare.R

data class Care(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val description: Int,
    val tag: String // Ex: "Mental", "Físico", "Social"
)

object CareRepository {
    val cares = listOf(
        Care(R.drawable.day1, R.string.day1, R.string.day_description_1, "Ambiental"),
        Care(R.drawable.day2, R.string.day2, R.string.day_description_2, "Intelectual"),
        Care(R.drawable.day3, R.string.day3, R.string.day_description_3, "Mental"),
        Care(R.drawable.day4, R.string.day4, R.string.day_description_4, "Físico"),
        Care(R.drawable.day5, R.string.day5, R.string.day_description_5, "Social"),
        Care(R.drawable.day6, R.string.day6, R.string.day_description_6, "Criativo"),
        Care(R.drawable.day7, R.string.day7, R.string.day_description_7, "Mental"),
        Care(R.drawable.day8, R.string.day8, R.string.day_description_8, "Físico"),
        Care(R.drawable.day9, R.string.day9, R.string.day_description_9, "Espiritual"),
        Care(R.drawable.day10, R.string.day10, R.string.day_description_10, "Social"),
        Care(R.drawable.day11, R.string.day11, R.string.day_description_11, "Intelectual"),
        Care(R.drawable.day12, R.string.day12, R.string.day_description_12, "Ambiental"),
        Care(R.drawable.day13, R.string.day13, R.string.day_description_13, "Físico"),
        Care(R.drawable.day14, R.string.day14, R.string.day_description_14, "Mental"),
        Care(R.drawable.day15, R.string.day15, R.string.day_description_15, "Social"),
        Care(R.drawable.day16, R.string.day16, R.string.day_description_16, "Criativo"),
        Care(R.drawable.day17, R.string.day17, R.string.day_description_17, "Espiritual"),
        Care(R.drawable.day18, R.string.day18, R.string.day_description_18, "Físico"),
        Care(R.drawable.day19, R.string.day19, R.string.day_description_19, "Mental"),
        Care(R.drawable.day20, R.string.day20, R.string.day_description_20, "Intelectual"),
        Care(R.drawable.day21, R.string.day21, R.string.day_description_21, "Social"),
        Care(R.drawable.day22, R.string.day22, R.string.day_description_22, "Ambiental"),
        Care(R.drawable.day23, R.string.day23, R.string.day_description_23, "Físico"),
        Care(R.drawable.day24, R.string.day24, R.string.day_description_24, "Mental"),
        Care(R.drawable.day25, R.string.day25, R.string.day_description_25, "Criativo"),
        Care(R.drawable.day26, R.string.day26, R.string.day_description_26, "Espiritual"),
        Care(R.drawable.day27, R.string.day27, R.string.day_description_27, "Social"),
        Care(R.drawable.day28, R.string.day28, R.string.day_description_28, "Físico"),
        Care(R.drawable.day29, R.string.day29, R.string.day_description_29, "Intelectual"),
        Care(R.drawable.day30, R.string.day30, R.string.day_description_30, "Mental")
    )
}