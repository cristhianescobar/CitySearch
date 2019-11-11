
package com.cristhianescobar.codegen.ws.models.venueDetails;

import java.util.List;


/**
 * The Items Schema
 * <p>
 * 
 * 
 */
public class Group__1 {

    /**
     * The Type Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "type")
    private String type = "";
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
     * The Items Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "items")
    private List<Object> items = null;

    /**
     * The Type Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getType() {
        return type;
    }

    /**
     * The Type Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setType(String type) {
        this.type = type;
    }

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
     * The Items Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public List<Object> getItems() {
        return items;
    }

    /**
     * The Items Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setItems(List<Object> items) {
        this.items = items;
    }

}
