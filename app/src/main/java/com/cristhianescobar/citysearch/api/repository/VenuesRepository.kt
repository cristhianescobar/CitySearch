package com.cristhianescobar.citysearch.api.repository

import com.cristhianescobar.citysearch.api.Result
import com.cristhianescobar.codegen.ws.models.typeahead.SuggestedResponse
import com.cristhianescobar.codegen.ws.models.typeahead.Venue
import com.cristhianescobar.codegen.ws.models.typeahead.VenuesResponse

interface VenuesRepository {
    suspend fun getVenuesNearBy(place: String, query: String): Result<List<Venue>>
    suspend fun getSuggestedVenues(near: String, query: String): Result<List<Venue>>
    suspend fun getVenueDetails(venueId: String): Result<com.cristhianescobar.codegen.ws.models.venueDetails.Venue>

}