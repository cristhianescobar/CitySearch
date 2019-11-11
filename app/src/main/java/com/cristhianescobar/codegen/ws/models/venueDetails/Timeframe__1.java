
package com.cristhianescobar.codegen.ws.models.venueDetails;

import java.util.List;


/**
 * The Items Schema
 * <p>
 * 
 * 
 */
public class Timeframe__1 {

    /**
     * The Days Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "days")
    private String days = "";
    /**
     * The Open Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "open")
    private List<Open__1> open = null;
    /**
     * The Segments Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "segments")
    private List<Object> segments = null;

    /**
     * The Days Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getDays() {
        return days;
    }

    /**
     * The Days Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setDays(String days) {
        this.days = days;
    }

    /**
     * The Open Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public List<Open__1> getOpen() {
        return open;
    }

    /**
     * The Open Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setOpen(List<Open__1> open) {
        this.open = open;
    }

    /**
     * The Segments Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public List<Object> getSegments() {
        return segments;
    }

    /**
     * The Segments Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setSegments(List<Object> segments) {
        this.segments = segments;
    }

}
