
package com.cristhianescobar.codegen.ws.models.typeahead;



/**
 * The Location Schema
 * <p>
 * 
 * 
 */
public class Location {

    /**
     * The Address Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "address")
    private String address = "";
    /**
     * The Crossstreet Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "crossStreet")
    private String crossStreet = "";
    /**
     * The City Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "city")
    private String city = "";
    /**
     * The State Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "state")
    private String state = "";
    /**
     * The Postalcode Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "postalCode")
    private String postalCode = "";
    /**
     * The Country Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "country")
    private String country = "";
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
     * The Distance Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "distance")
    private long distance = 0L;

    /**
     * The Address Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getAddress() {
        return address;
    }

    /**
     * The Address Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * The Crossstreet Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getCrossStreet() {
        return crossStreet;
    }

    /**
     * The Crossstreet Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setCrossStreet(String crossStreet) {
        this.crossStreet = crossStreet;
    }

    /**
     * The City Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getCity() {
        return city;
    }

    /**
     * The City Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * The State Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getState() {
        return state;
    }

    /**
     * The State Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * The Postalcode Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * The Postalcode Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * The Country Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getCountry() {
        return country;
    }

    /**
     * The Country Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setCountry(String country) {
        this.country = country;
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

    /**
     * The Distance Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public long getDistance() {
        return distance;
    }

    /**
     * The Distance Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setDistance(long distance) {
        this.distance = distance;
    }

}
