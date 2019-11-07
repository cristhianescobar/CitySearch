
package com.cristhianescobar.codegen.ws.models.typeahead;

import java.util.List;


/**
 * The Response Schema
 * <p>
 * 
 * 
 */
public class Response {

    /**
     * The Minivenues Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "minivenues")
    private List<Venue> minivenues = null;
    /**
     * The Minivenues Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "venues")
    private List<Venue> venues = null;

    /**
     * The Minivenues Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public List<Venue> getMinivenues() {
        return minivenues;
    }

    /**
     * The Minivenues Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setMinivenues(List<Venue> minivenues) {
        this.minivenues = minivenues;
    }

    /**
     * The Minivenues Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public List<Venue> getVenues() {
        return venues;
    }

    /**
     * The Minivenues Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setVenues(List<Venue> venues) {
        this.venues = venues;
    }

}
