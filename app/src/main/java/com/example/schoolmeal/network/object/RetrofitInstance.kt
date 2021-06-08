package com.example.schoolmeal.network.`object`

import com.example.schoolmeal.network.dao.SchoolMealService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private const val BASE_URL = "https://open.neis.go.kr/hub/"
    const val KEY_VALUE = "5111550a457a43d898a8ebe7bfba1a5e"
    const val TYPE_VALUE = "json"

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val schoolMealService: SchoolMealService = retrofit.create(SchoolMealService::class.java)
}