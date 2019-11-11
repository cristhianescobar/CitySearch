
package com.cristhianescobar.codegen.ws.models.venueDetails;

import java.util.List;


/**
 * The Herenow Schema
 * <p>
 * 
 * 
 */
public class HereNow {

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
     * The Groups Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "groups")
    private List<Group__2> groups = null;

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

    /**
     * The Groups Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public List<Group__2> getGroups() {
        return groups;
    }

    /**
     * The Groups Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setGroups(List<Group__2> groups) {
        this.groups = groups;
    }

}
