package com.cristhianescobar.citysearch.api.webservice

import com.cristhianescobar.citysearch.BuildConfig
import com.cristhianescobar.codegen.ws.models.typeahead.SuggestedResponse
import com.cristhianescobar.codegen.ws.models.typeahead.VenuesResponse

class VenuesService(private val venuesServiceAPI: VenuesServiceAPI) {

    suspend fun getVenuesNearBy(place: String, query: String): VenuesResponse {
        return venuesServiceAPI.getVenuesNearBy(
            clientId = BuildConfig.FOUR_SQUARE_CLIENT_ID,
            clientSecret = BuildConfig.FOUR_SQUARE_CLIENT_SECRET,
            near = place,
            query = query,
            versioning = "20180401"
        )
    }

    suspend fun getSuggestedVenues(near: String, searchWord: String): SuggestedResponse {
        return venuesServiceAPI.getSuggestedVenues(
            clientId = BuildConfig.FOUR_SQUARE_CLIENT_ID,
            clientSecret = BuildConfig.FOUR_SQUARE_CLIENT_SECRET,
            near = near,
            searchWord = searchWord,
            versioning = "20180401"
        )
    }
}