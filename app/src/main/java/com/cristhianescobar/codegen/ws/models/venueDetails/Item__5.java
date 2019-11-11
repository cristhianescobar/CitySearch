
package com.cristhianescobar.codegen.ws.models.venueDetails;



/**
 * The Items Schema
 * <p>
 * 
 * 
 */
public class Item__5 {

    /**
     * The Displayname Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "displayName")
    private String displayName = "";
    /**
     * The Displayvalue Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "displayValue")
    private String displayValue = "";

    /**
     * The Displayname Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The Displayname Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * The Displayvalue Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getDisplayValue() {
        return displayValue;
    }

    /**
     * The Displayvalue Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

}
