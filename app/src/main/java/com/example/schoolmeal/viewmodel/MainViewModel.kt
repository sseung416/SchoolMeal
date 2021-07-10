package com.example.schoolmeal.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.schoolmeal.network.`object`.RetrofitInstance
import com.example.schoolmeal.network.dto.response.Data
import com.example.schoolmeal.network.dto.response.Res

class MainViewModel: ViewModel() {
    private val vaccinatedService by lazy {
        RetrofitInstance.vaccinatedService
    }

    private var vaccinatedData = MutableLiveData<Res<Data>>()

    private fun getVaccinatedInfo() {
    }
}