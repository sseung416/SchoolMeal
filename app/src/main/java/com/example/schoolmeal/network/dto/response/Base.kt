package com.example.schoolmeal.network.dto.response

data class Base(
    val currentCount : Int,
    val data : List<Data>,
    val matchCount : Int,
    val page : Int,
    val perPage : Int,
    val totalCount : Int
)