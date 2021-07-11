package com.example.schoolmeal.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.schoolmeal.network.`object`.RetrofitInstance
import com.example.schoolmeal.network.dto.response.Base
import com.example.schoolmeal.network.dto.response.Data
import com.example.schoolmeal.network.dto.response.Res
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel: ViewModel() {
    private val vaccinatedService by lazy {
        RetrofitInstance.vaccinatedService
    }

    var vaccinatedInfo = MutableLiveData<Base>()

    fun getVaccinatedInfo() {
        vaccinatedService.getVaccinatedInfo().enqueue(object : Callback<Base> {
            override fun onResponse(call: Call<Base>, response: Response<Base>) {
                Log.d("getVaccinatedInfo", "success: ${response.code()}, ${response.body()}")

                when(response.code()) {
                    200 -> vaccinatedInfo.postValue(response.body())
                }
            }

            override fun onFailure(call: Call<Base>, t: Throwable) {
                Log.d("getVaccinatedInfo", "fail: ${t.message.toString()}")
            }

        })
    }
}