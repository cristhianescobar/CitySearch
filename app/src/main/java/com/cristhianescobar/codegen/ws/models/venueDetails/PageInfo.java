
package com.cristhianescobar.codegen.ws.models.venueDetails;



/**
 * The Pageinfo Schema
 * <p>
 * 
 * 
 */
public class PageInfo {

    /**
     * The Description Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "description")
    private String description = "";
    /**
     * The Banner Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "banner")
    private String banner = "";
    /**
     * The Links Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "links")
    private Links links;

    /**
     * The Description Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getDescription() {
        return description;
    }

    /**
     * The Description Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The Banner Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getBanner() {
        return banner;
    }

    /**
     * The Banner Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setBanner(String banner) {
        this.banner = banner;
    }

    /**
     * The Links Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Links getLinks() {
        return links;
    }

    /**
     * The Links Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setLinks(Links links) {
        this.links = links;
    }

}
