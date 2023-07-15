package com.mahrous.data.remote

import com.mahrous.domain.entity.CategoryResponse
import retrofit2.http.GET

interface ApiService {
    @GET("categories.php")
    suspend fun getMeals(): CategoryResponse
}