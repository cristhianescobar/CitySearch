package com.cristhianescobar.citysearch.api.repository

import com.cristhianescobar.codegen.ws.models.VenuesResponse
import com.cristhianescobar.citysearch.api.Result

interface VenuesRepository {
    suspend fun getVenuesNearBy(place: String, query: String): Result<VenuesResponse>
}