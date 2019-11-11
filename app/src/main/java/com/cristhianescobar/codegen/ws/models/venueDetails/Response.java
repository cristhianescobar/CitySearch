
package com.cristhianescobar.codegen.ws.models.venueDetails;

import com.squareup.moshi.Json;


/**
 * The Response Schema
 * <p>
 * 
 * 
 */
public class Response {

    /**
     * The Venue Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @Json(name = "venue")
    private Venue venue;

    /**
     * The Venue Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Venue getVenue() {
        return venue;
    }

    /**
     * The Venue Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setVenue(Venue venue) {
        this.venue = venue;
    }

}
