
package com.cristhianescobar.codegen.ws.models.venue;

import com.squareup.moshi.Json;


/**
 * The Venuepage Schema
 * <p>
 * 
 * 
 */
public class VenuePage {

    /**
     * The Id Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @Json(name = "id")
    private String id = "";

    /**
     * The Id Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * The Id Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setId(String id) {
        this.id = id;
    }

}
