
package com.cristhianescobar.codegen.ws.models.venueDetails;



/**
 * The Contact Schema
 * <p>
 * 
 * 
 */
public class Contact {

    /**
     * The Phone Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "phone")
    private String phone = "";
    /**
     * The Formattedphone Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "formattedPhone")
    private String formattedPhone = "";
    /**
     * The Twitter Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "twitter")
    private String twitter = "";
    /**
     * The Instagram Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "instagram")
    private String instagram = "";
    /**
     * The Facebook Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "facebook")
    private String facebook = "";
    /**
     * The Facebookusername Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "facebookUsername")
    private String facebookUsername = "";
    /**
     * The Facebookname Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "facebookName")
    private String facebookName = "";

    /**
     * The Phone Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getPhone() {
        return phone;
    }

    /**
     * The Phone Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * The Formattedphone Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getFormattedPhone() {
        return formattedPhone;
    }

    /**
     * The Formattedphone Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setFormattedPhone(String formattedPhone) {
        this.formattedPhone = formattedPhone;
    }

    /**
     * The Twitter Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getTwitter() {
        return twitter;
    }

    /**
     * The Twitter Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    /**
     * The Instagram Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getInstagram() {
        return instagram;
    }

    /**
     * The Instagram Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    /**
     * The Facebook Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getFacebook() {
        return facebook;
    }

    /**
     * The Facebook Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    /**
     * The Facebookusername Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getFacebookUsername() {
        return facebookUsername;
    }

    /**
     * The Facebookusername Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setFacebookUsername(String facebookUsername) {
        this.facebookUsername = facebookUsername;
    }

    /**
     * The Facebookname Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getFacebookName() {
        return facebookName;
    }

    /**
     * The Facebookname Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setFacebookName(String facebookName) {
        this.facebookName = facebookName;
    }

}
