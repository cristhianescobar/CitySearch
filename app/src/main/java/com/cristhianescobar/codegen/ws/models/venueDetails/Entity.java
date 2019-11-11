
package com.cristhianescobar.codegen.ws.models.venueDetails;

import java.util.List;


/**
 * The Items Schema
 * <p>
 * 
 * 
 */
public class Entity {

    /**
     * The Indices Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "indices")
    private List<Long> indices = null;
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
     * The Indices Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public List<Long> getIndices() {
        return indices;
    }

    /**
     * The Indices Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setIndices(List<Long> indices) {
        this.indices = indices;
    }

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

}
