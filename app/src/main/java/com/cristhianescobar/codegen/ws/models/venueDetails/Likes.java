
package com.cristhianescobar.codegen.ws.models.venueDetails;



/**
 * The Likes Schema
 * <p>
 * 
 * 
 */
public class Likes {

    /**
     * The Count Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "count")
    private long count = 0L;
    /**
     * The Summary Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "summary")
    private String summary = "";

    /**
     * The Count Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public long getCount() {
        return count;
    }

    /**
     * The Count Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setCount(long count) {
        this.count = count;
    }

    /**
     * The Summary Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getSummary() {
        return summary;
    }

    /**
     * The Summary Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

}
