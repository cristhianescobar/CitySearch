package com.cristhianescobar.citysearch.api.repository.impl

import android.app.Application
import android.util.Log
import com.cristhianescobar.citysearch.api.repository.VenuesRepository
import com.cristhianescobar.citysearch.api.webservice.VenuesService
import org.koin.android.ext.android.inject
import com.cristhianescobar.citysearch.api.Result
import com.cristhianescobar.codegen.ws.models.typeahead.SuggestedResponse
import com.cristhianescobar.codegen.ws.models.typeahead.VenuesResponse
import retrofit2.HttpException


class VenuesRepositoryImpl(application: Application) : VenuesRepository {


    private val venuesService: VenuesService by application.inject()

    override suspend fun getVenuesNearBy(place: String, query: String): Result<VenuesResponse> {
        return try {
            val venuesNearBy = venuesService.getVenuesNearBy(place, query)
            Result.Success(venuesNearBy)
        } catch (e : HttpException) {
            Log.d("cje466", "${e.message()}")
            Log.d("cje466", "${e.response()}")
            Result.Error(e)
        }
    }

    override suspend fun getSuggestedVenues(near: String, searchWord: String): Result<SuggestedResponse> {
        return try {
            val suggested = venuesService.getSuggestedVenues(near, searchWord)
            Log.d("cje466- Suggested", "${suggested.response.minivenues.map { it.name }}")
            Result.Success(suggested)
        } catch (e : HttpException) {
            Log.d("cje466", "${e.message()}")
            Log.d("cje466", "${e.response()}")
            Result.Error(e)
        }
    }

}