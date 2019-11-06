package com.cristhianescobar.citysearch.api.repository.impl

import android.app.Application
import android.util.Log
import com.cristhianescobar.citysearch.api.repository.VenuesRepository
import com.cristhianescobar.citysearch.api.webservice.VenuesService
import com.cristhianescobar.codegen.ws.models.VenuesResponse
import org.koin.android.ext.android.inject
import com.cristhianescobar.citysearch.api.Result
import retrofit2.HttpException


class VenuesRepositoryImpl(application: Application) : VenuesRepository {
    private val venuesService: VenuesService by application.inject()

    override suspend fun getVenuesNearBy(place: String, query: String): Result<VenuesResponse> {
        try {
            val venuesNearBy = venuesService.getVenuesNearBy(place, query)
            return Result.Success(venuesNearBy)
        } catch (e : HttpException) {
            Log.d("cje466", "${e.message()}")
            Log.d("cje466", "${e.response()}")
            return Result.Error(e)
        }

    }
}