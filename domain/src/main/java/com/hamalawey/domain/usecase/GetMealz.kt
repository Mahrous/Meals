package com.hamalawey.domain.usecase

import com.hamalawey.domain.repo.MealsRepo

class GetMealz(private val mealsRepo: MealsRepo) {
     operator suspend fun invoke() = mealsRepo.getMealsFromRemote()
}
