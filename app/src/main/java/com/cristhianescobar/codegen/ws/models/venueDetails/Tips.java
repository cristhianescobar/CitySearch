
package com.cristhianescobar.codegen.ws.models.venueDetails;

import com.squareup.moshi.Json;


/**
 * The Tips Schema
 * <p>
 * 
 * 
 */
public class Tips {

    /**
     * The Count Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @Json(name = "count")
    private long count = 0L;

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

}
