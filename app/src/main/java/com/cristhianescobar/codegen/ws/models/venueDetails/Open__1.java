
package com.cristhianescobar.codegen.ws.models.venueDetails;

import com.squareup.moshi.Json;


/**
 * The Items Schema
 * <p>
 * 
 * 
 */
public class Open__1 {

    /**
     * The Renderedtime Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @Json(name = "renderedTime")
    private String renderedTime = "";

    /**
     * The Renderedtime Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getRenderedTime() {
        return renderedTime;
    }

    /**
     * The Renderedtime Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setRenderedTime(String renderedTime) {
        this.renderedTime = renderedTime;
    }

}
