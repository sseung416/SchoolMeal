package com.example.schoolmeal.network.`object`

import com.example.schoolmeal.network.dao.SchoolMealService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private const val BASE_URL = "https://open.neis.go.kr/hub/mealServiceDietInfo?"
    private const val KEY_VALUE = "KEY=5111550a457a43d898a8ebe7bfba1a5e"
    private const val TYPE_VALUE = "&Type=json"

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL + KEY_VALUE + TYPE_VALUE)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val schoolMealService: SchoolMealService = retrofit.create(SchoolMealService::class.java)
}