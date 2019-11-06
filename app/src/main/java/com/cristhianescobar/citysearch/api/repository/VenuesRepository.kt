package com.cristhianescobar.citysearch.api.repository

import com.cristhianescobar.citysearch.api.Result
import com.cristhianescobar.codegen.ws.models.venue.VenuesResponse

interface VenuesRepository {
    suspend fun getVenuesNearBy(place: String, query: String): Result<VenuesResponse>
}