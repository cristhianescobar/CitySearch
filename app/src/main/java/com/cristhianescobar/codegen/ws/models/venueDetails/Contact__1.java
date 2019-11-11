
package com.cristhianescobar.codegen.ws.models.venueDetails;



/**
 * The Contact Schema
 * <p>
 * 
 * 
 */
public class Contact__1 {

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
     * The Facebook Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "facebook")
    private String facebook = "";

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

}
