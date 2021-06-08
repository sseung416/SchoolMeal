package com.example.schoolmeal.network.dto

import com.google.gson.annotations.SerializedName
import java.util.*

data class Meal(
    @SerializedName("MLSV_YMD")
    val date: Date,

    @SerializedName("MLSV_SC_CODE")
    val mealCode: Int,

    @SerializedName("DDISH_NM")
    val dishList: List<String>,

    @SerializedName("CAL_INFO")
    val calorie: String
)
