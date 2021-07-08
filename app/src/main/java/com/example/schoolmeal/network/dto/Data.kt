package com.example.schoolmeal.network.dto

import com.google.gson.annotations.SerializedName

data class Data(
    val accumulatedFirstCnt : Int,
    val accumulatedSecondCnt : Int,
    val baseDate : String,
    val firstCnt : Int,
    val secondCnt : Int,
    val sido : String,
    val totalFirstCnt : Int,
    val totalSecondCnt : Int

//    @SerializedName("sido") val sido: String,
//    @SerializedName("firstCnt") val firstCnt: Int,
//    @SerializedName("totalFirstCnt") val totalFirstCnt: Int
)
