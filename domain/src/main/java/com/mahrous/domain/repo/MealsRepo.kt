package com.mahrous.domain.repo

import com.mahrous.domain.entity.CategoryResponse

interface MealsRepo {
    suspend fun getMealsFromRemote(): CategoryResponse
}