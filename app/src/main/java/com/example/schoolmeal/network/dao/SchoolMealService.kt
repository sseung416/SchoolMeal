package com.example.schoolmeal.network.dao

import com.example.schoolmeal.network.dto.Meal
import com.example.schoolmeal.network.dto.School
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

interface SchoolMealService {
    @GET("mealServiceDietInfo")
    fun getSchoolInfo(
        @Query("KEY") key: String,
        @Query("Type") type: String,
        @Query("ATPT_OFCDC_SC_CODE") MOECode: String,
        @Query("SD_SCHUL_CODE") schoolCode: String
    ) : Call<School>

    @GET("mealServiceDietInfo")
    fun getMealInfo(
        @Query("KEY") key: String,
        @Query("Type") type: String,
        @Query("ATPT_OFCDC_SC_CODE") MOECode: String,
        @Query("SD_SCHUL_CODE") schoolCode: String,
        @Query("MLSV_YMD") date: String,
    ) : Call<Meal>
}