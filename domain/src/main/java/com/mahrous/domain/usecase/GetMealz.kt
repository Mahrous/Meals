package com.mahrous.domain.usecase

import com.mahrous.domain.repo.MealsRepo

class GetMealz(private val mealsRepo: MealsRepo) {
     operator suspend fun invoke() = mealsRepo.getMealsFromRemote()
}
