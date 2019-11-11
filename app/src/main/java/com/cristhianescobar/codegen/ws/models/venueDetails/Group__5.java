
package com.cristhianescobar.codegen.ws.models.venueDetails;

import java.util.List;


/**
 * The Items Schema
 * <p>
 * 
 * 
 */
public class Group__5 {

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
     * The Name Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "name")
    private String name = "";
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
    private List<Item__3> items = null;

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
    public List<Item__3> getItems() {
        return items;
    }

    /**
     * The Items Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setItems(List<Item__3> items) {
        this.items = items;
    }

}
