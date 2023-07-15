package com.mahrous.mealz.di

import com.mahrous.data.remote.ApiService
import com.mahrous.data.repo.MealsRepoImpl
import com.mahrous.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideRepo(apiService: ApiService): MealsRepo{
        return MealsRepoImpl(apiService)
    }
}