package com.example.fakestorecomposenoroom.data

import android.content.Context
import com.example.fakestorecomposenoroom.data.remote.AppApi
import com.example.fakestorecomposenoroom.domain.AppRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit = Retrofit.Builder()
        .baseUrl("https://fakestorecomposenoroom.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Singleton
    @Provides
    fun provideAppApi(retrofit: Retrofit): AppApi{
        return retrofit.create(AppApi::class.java)
    }

}