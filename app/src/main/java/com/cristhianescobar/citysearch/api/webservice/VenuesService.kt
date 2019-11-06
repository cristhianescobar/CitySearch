package com.cristhianescobar.citysearch.api.webservice

import com.cristhianescobar.citysearch.BuildConfig
import com.cristhianescobar.codegen.ws.models.venue.VenuesResponse

class VenuesService(private val venuesServiceAPI: VenuesServiceAPI) {

    suspend fun getVenuesNearBy(place: String, query: String): VenuesResponse {
        return venuesServiceAPI.getVenuesNearBy(
            clientId = BuildConfig.FOUR_SQUARE_CLIENT_ID,
            clientSecret = BuildConfig.FOUR_SQUARE_CLIENT_SECRET,
            place = place,
            query = query,
            versioning = "20180401"
        )
    }
}