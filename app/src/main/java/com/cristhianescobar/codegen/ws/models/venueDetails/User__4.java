
package com.cristhianescobar.codegen.ws.models.venueDetails;



/**
 * The User Schema
 * <p>
 * 
 * 
 */
public class User__4 {

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
     * The Firstname Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "firstName")
    private String firstName = "";
    /**
     * The Gender Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "gender")
    private String gender = "";
    /**
     * The Photo Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "photo")
    private Photo__5 photo;
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
     * The Firstname Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * The Firstname Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * The Gender Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getGender() {
        return gender;
    }

    /**
     * The Gender Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * The Photo Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Photo__5 getPhoto() {
        return photo;
    }

    /**
     * The Photo Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setPhoto(Photo__5 photo) {
        this.photo = photo;
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
