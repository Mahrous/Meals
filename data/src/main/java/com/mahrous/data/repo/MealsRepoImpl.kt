package com.mahrous.data.repo

import com.mahrous.data.remote.ApiService
import com.mahrous.domain.entity.CategoryResponse
import com.mahrous.domain.repo.MealsRepo

class MealsRepoImpl(private val apiService: ApiService): MealsRepo {
    override suspend fun getMealsFromRemote(): CategoryResponse = apiService.getMeals()
}