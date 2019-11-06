
package com.cristhianescobar.codegen.ws.models;

import java.util.List;
import com.squareup.moshi.Json;


/**
 * The Response Schema
 * <p>
 * 
 * 
 */
public class Response {

    /**
     * The Venues Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @Json(name = "venues")
    private List<Venue> venues = null;

    /**
     * The Venues Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public List<Venue> getVenues() {
        return venues;
    }

    /**
     * The Venues Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setVenues(List<Venue> venues) {
        this.venues = venues;
    }

}
