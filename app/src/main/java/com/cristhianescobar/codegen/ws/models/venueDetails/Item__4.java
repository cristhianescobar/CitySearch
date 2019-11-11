
package com.cristhianescobar.codegen.ws.models.venueDetails;



/**
 * The Items Schema
 * <p>
 * 
 * 
 */
public class Item__4 {

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
     * The Createdat Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "createdAt")
    private long createdAt = 0L;
    /**
     * The Photo Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "photo")
    private Photo__6 photo;

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
     * The Createdat Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public long getCreatedAt() {
        return createdAt;
    }

    /**
     * The Createdat Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The Photo Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Photo__6 getPhoto() {
        return photo;
    }

    /**
     * The Photo Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setPhoto(Photo__6 photo) {
        this.photo = photo;
    }

}
