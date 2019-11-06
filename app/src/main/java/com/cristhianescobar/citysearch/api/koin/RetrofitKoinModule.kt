package com.cristhianescobar.citysearch.api.koin

import com.cristhianescobar.citysearch.BuildConfig
import com.cristhianescobar.citysearch.api.webservice.VenuesServiceAPI
import com.squareup.moshi.Moshi
import com.squareup.moshi.adapters.Rfc3339DateJsonAdapter
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import com.facebook.stetho.okhttp3.StethoInterceptor
import okhttp3.logging.HttpLoggingInterceptor
import java.util.*


internal val retrofitKoinModule = module {
    single { createApiImpl(VenuesServiceAPI::class.java) }
}

private val moshi: Moshi = Moshi.Builder()
    .add(Date::class.java, Rfc3339DateJsonAdapter())
    .build()

private val client = OkHttpClient.Builder()
    .addNetworkInterceptor(StethoInterceptor())
    .addInterceptor(HttpLoggingInterceptor())
    .build()

fun <T> createApiImpl(endpoint: Class<T>, baseUrl: String = BuildConfig.FOUR_SQUARE_API):
        T = Retrofit.Builder()
    .baseUrl(baseUrl)
    .client(client)
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .build()
    .create(endpoint)

