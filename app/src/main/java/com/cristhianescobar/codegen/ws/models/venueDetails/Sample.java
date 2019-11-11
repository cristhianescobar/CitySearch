
package com.cristhianescobar.codegen.ws.models.venueDetails;

import java.util.List;


/**
 * The Sample Schema
 * <p>
 * 
 * 
 */
public class Sample {

    /**
     * The Entities Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "entities")
    private List<Entity> entities = null;
    /**
     * The Text Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "text")
    private String text = "";

    /**
     * The Entities Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public List<Entity> getEntities() {
        return entities;
    }

    /**
     * The Entities Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    /**
     * The Text Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getText() {
        return text;
    }

    /**
     * The Text Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setText(String text) {
        this.text = text;
    }

}
