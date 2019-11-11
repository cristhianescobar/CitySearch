
package com.cristhianescobar.codegen.ws.models.venueDetails;



/**
 * The User Schema
 * <p>
 * 
 * 
 */
public class User {

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
     * The Lastname Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "lastName")
    private String lastName = "";
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
     * The Lastname Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * The Lastname Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
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

}
