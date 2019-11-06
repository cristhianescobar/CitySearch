
package com.cristhianescobar.codegen.ws.models.venue;

import java.util.List;


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
     * The Labeledlatlngs Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "labeledLatLngs")
    private List<LabeledLatLng> labeledLatLngs = null;
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
     * The Postalcode Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "postalCode")
    private String postalCode = "";
    /**
     * The Cc Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "cc")
    private String cc = "";
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
     * The Country Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "country")
    private String country = "";
    /**
     * The Formattedaddress Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "formattedAddress")
    private List<String> formattedAddress = null;

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
     * The Labeledlatlngs Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public List<LabeledLatLng> getLabeledLatLngs() {
        return labeledLatLngs;
    }

    /**
     * The Labeledlatlngs Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setLabeledLatLngs(List<LabeledLatLng> labeledLatLngs) {
        this.labeledLatLngs = labeledLatLngs;
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
     * The Cc Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getCc() {
        return cc;
    }

    /**
     * The Cc Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setCc(String cc) {
        this.cc = cc;
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
     * The Formattedaddress Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public List<String> getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * The Formattedaddress Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setFormattedAddress(List<String> formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

}
