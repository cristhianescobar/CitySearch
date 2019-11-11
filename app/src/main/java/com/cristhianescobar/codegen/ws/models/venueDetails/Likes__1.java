
package com.cristhianescobar.codegen.ws.models.venueDetails;

import java.util.List;


/**
 * The Likes Schema
 * <p>
 * 
 * 
 */
public class Likes__1 {

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
     * The Groups Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "groups")
    private List<Group__4> groups = null;
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
     * The Groups Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public List<Group__4> getGroups() {
        return groups;
    }

    /**
     * The Groups Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setGroups(List<Group__4> groups) {
        this.groups = groups;
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
