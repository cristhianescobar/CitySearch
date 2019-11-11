
package com.cristhianescobar.codegen.ws.models.venueDetails;

import java.util.List;


/**
 * The Listitems Schema
 * <p>
 * 
 * 
 */
public class ListItems {

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
    private List<Item__4> items = null;

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
    public List<Item__4> getItems() {
        return items;
    }

    /**
     * The Items Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setItems(List<Item__4> items) {
        this.items = items;
    }

}
