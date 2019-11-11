
package com.cristhianescobar.codegen.ws.models.venueDetails;

import com.squareup.moshi.Json;


/**
 * The Items Schema
 * <p>
 * 
 * 
 */
public class Item__1 {

    /**
     * The Url Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @Json(name = "url")
    private String url = "";

    /**
     * The Url Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getUrl() {
        return url;
    }

    /**
     * The Url Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setUrl(String url) {
        this.url = url;
    }

}
