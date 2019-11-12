package com.cristhianescobar.citysearch.api.repository.impl

import android.app.Application
import android.util.Log
import com.cristhianescobar.citysearch.api.repository.VenuesRepository
import com.cristhianescobar.citysearch.api.webservice.VenuesService
import org.koin.android.ext.android.inject
import com.cristhianescobar.citysearch.api.Result
import com.cristhianescobar.codegen.ws.models.typeahead.SuggestedResponse
import com.cristhianescobar.codegen.ws.models.typeahead.Venue
import com.cristhianescobar.codegen.ws.models.typeahead.VenuesResponse
import com.cristhianescobar.codegen.ws.models.venueDetails.VenueDetailsResponse
import retrofit2.HttpException


class VenuesRepositoryImpl(application: Application) : VenuesRepository {

    private val venuesService: VenuesService by application.inject()

    override suspend fun getVenuesNearBy(place: String, query: String): Result<List<Venue>> {
        return try {
            val venuesNearBy = venuesService.getVenuesNearBy(place, query)
            Result.Success(venuesNearBy.response.venues)
        } catch (e: HttpException) {
            Result.Error(e)
        }
    }

    override suspend fun getSuggestions(near: String, searchWord: String): Result<List<Venue>> {
        return try {
            val suggested = venuesService.getSuggestedVenues(near, searchWord)
            Result.Success(suggested.response.minivenues)
        } catch (e: HttpException) {
            Result.Error(e)
        }
    }

    override suspend fun getVenueDetails(venueId: String): Result<com.cristhianescobar.codegen.ws.models.venueDetails.Venue> {
        return try {
            val suggested = venuesService.getVenueDetails(venueId)
            Result.Success(suggested.response.venue)
        } catch (e: HttpException) {
            Result.Error(e)
        }
    }

}