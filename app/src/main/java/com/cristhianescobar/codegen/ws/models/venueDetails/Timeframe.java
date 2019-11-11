
package com.cristhianescobar.codegen.ws.models.venueDetails;

import java.util.List;


/**
 * The Items Schema
 * <p>
 * 
 * 
 */
public class Timeframe {

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
     * The Includestoday Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "includesToday")
    private boolean includesToday = false;
    /**
     * The Open Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "open")
    private List<Open> open = null;
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
     * The Includestoday Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public boolean isIncludesToday() {
        return includesToday;
    }

    /**
     * The Includestoday Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setIncludesToday(boolean includesToday) {
        this.includesToday = includesToday;
    }

    /**
     * The Open Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public List<Open> getOpen() {
        return open;
    }

    /**
     * The Open Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setOpen(List<Open> open) {
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
