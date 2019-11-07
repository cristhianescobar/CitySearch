package com.cristhianescobar.citysearch.api.repository

import com.cristhianescobar.citysearch.api.Result
import com.cristhianescobar.codegen.ws.models.typeahead.SuggestedResponse
import com.cristhianescobar.codegen.ws.models.typeahead.VenuesResponse

interface VenuesRepository {
    suspend fun getVenuesNearBy(place: String, query: String): Result<VenuesResponse>
    suspend fun getSuggestedVenues(near: String, query: String): Result<SuggestedResponse>
}