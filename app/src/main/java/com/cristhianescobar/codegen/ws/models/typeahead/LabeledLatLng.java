
package com.cristhianescobar.codegen.ws.models.typeahead;



/**
 * The Items Schema
 * <p>
 * 
 * 
 */
public class LabeledLatLng {

    /**
     * The Label Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "label")
    private String label = "";
    /**
     * The Lat Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "lat")
    private double lat = 0.0D;
    /**
     * The Lng Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "lng")
    private double lng = 0.0D;

    /**
     * The Label Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getLabel() {
        return label;
    }

    /**
     * The Label Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * The Lat Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public double getLat() {
        return lat;
    }

    /**
     * The Lat Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setLat(double lat) {
        this.lat = lat;
    }

    /**
     * The Lng Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public double getLng() {
        return lng;
    }

    /**
     * The Lng Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setLng(double lng) {
        this.lng = lng;
    }

}
