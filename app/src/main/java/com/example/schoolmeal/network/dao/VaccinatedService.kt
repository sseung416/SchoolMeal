package com.example.schoolmeal.network.dao

import com.example.schoolmeal.network.`object`.RetrofitInstance
import com.example.schoolmeal.network.dto.Base
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface VaccinatedService {
    @GET("15077756/v1/vaccine-stat")
    fun getVaccinatedInfo(
//        @Query("page") page: Int = 1,
//        @Query("perPage") perPage: Int = 10,
        @Query("serviceKey") serviceKey: String = RetrofitInstance.API_KEY,
    ): Call<Base>
}