
package com.cristhianescobar.codegen.ws.models.venueDetails;

import java.util.List;


/**
 * The Listed Schema
 * <p>
 * 
 * 
 */
public class Listed {

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
    private List<Group__5> groups = null;

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
    public List<Group__5> getGroups() {
        return groups;
    }

    /**
     * The Groups Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setGroups(List<Group__5> groups) {
        this.groups = groups;
    }

}
