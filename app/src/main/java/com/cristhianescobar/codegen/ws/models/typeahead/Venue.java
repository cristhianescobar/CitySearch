
package com.cristhianescobar.codegen.ws.models.typeahead;

import java.util.List;


/**
 * The Items Schema
 * <p>
 * 
 * 
 */
public class Venue {

    /**
     * The Id Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "id")
    private String id = "";
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
     * The Location Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "location")
    private Location location;
    /**
     * The Categories Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "categories")
    private List<Category> categories = null;
    /**
     * The Hasperk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "hasPerk")
    private boolean hasPerk = false;

    /**
     * The Id Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * The Id Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setId(String id) {
        this.id = id;
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
     * The Location Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Location getLocation() {
        return location;
    }

    /**
     * The Location Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * The Categories Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public List<Category> getCategories() {
        return categories;
    }

    /**
     * The Categories Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    /**
     * The Hasperk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public boolean isHasPerk() {
        return hasPerk;
    }

    /**
     * The Hasperk Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setHasPerk(boolean hasPerk) {
        this.hasPerk = hasPerk;
    }

}
