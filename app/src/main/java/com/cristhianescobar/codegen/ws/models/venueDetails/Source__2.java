
package com.cristhianescobar.codegen.ws.models.venueDetails;



/**
 * The Source Schema
 * <p>
 * 
 * 
 */
public class Source__2 {

    /**
     * The Name Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "name")
    private String name = "";
    /**
     * The Url Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "url")
    private String url = "";

    /**
     * The Name Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * The Name Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

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
