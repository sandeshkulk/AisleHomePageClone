package com.example.aisle.di

import com.example.aisle.data.NetworkService
import com.example.aisle.data.Repository
import com.example.aisle.domain.RepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun APIResponse():NetworkService{
        return Retrofit.Builder().baseUrl("https://app.aisle.co/V1/").addConverterFactory(GsonConverterFactory.create()).build().create(
            NetworkService::class.java)
    }

    @Provides
    @Singleton
    fun AddRepository(api:NetworkService): RepositoryImp {
        return Repository(api)
    }

}