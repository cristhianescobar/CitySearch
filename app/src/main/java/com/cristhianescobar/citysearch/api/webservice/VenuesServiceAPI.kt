package com.cristhianescobar.citysearch.api.webservice

import com.cristhianescobar.codegen.ws.models.venue.VenuesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface VenuesServiceAPI {
    /**
     *  Gets the nearby venues from FourSquare
     *  Docs: https://developer.foursquare.com/docs/api/venues/search
     *  Sample Request:
     *  https://api.foursquare.com/v2/venues/search?near=Seattle,+WA&query=coffee&v=20180401&limit=20
     */

    @GET("v2/venues/search")
    suspend fun getVenuesNearBy(
        @Query("client_id") clientId: String,
        @Query("client_secret") clientSecret: String,
        @Query("near") place: String,
        @Query("query") query: String,
        @Query("v") versioning: String
    ): VenuesResponse
}