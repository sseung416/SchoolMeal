package com.example.schoolmeal.network.`object`

import com.example.schoolmeal.network.dao.VaccinatedService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private const val BASE_URL = "https://api.odcloud.kr/api/"
    const val API_KEY = "DZD2NyAuBGNuO6LzU86Ep0EaFyV6WNuJn45Vx8g28vkDfRrUe+B2IzZ9+w7poC9Ljs511XXsEWfAQraiqn+dRw=="

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val vaccinatedService: VaccinatedService = retrofit.create(VaccinatedService::class.java)
}