
package com.cristhianescobar.codegen.ws.models.venueDetails;

import java.util.List;


/**
 * The Hours Schema
 * <p>
 * 
 * 
 */
public class Hours {

    /**
     * The Status Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "status")
    private String status = "";
    /**
     * The Isopen Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "isOpen")
    private boolean isOpen = false;
    /**
     * The Islocalholiday Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "isLocalHoliday")
    private boolean isLocalHoliday = false;
    /**
     * The Timeframes Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "timeframes")
    private List<Timeframe> timeframes = null;

    /**
     * The Status Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getStatus() {
        return status;
    }

    /**
     * The Status Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * The Isopen Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public boolean isIsOpen() {
        return isOpen;
    }

    /**
     * The Isopen Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    /**
     * The Islocalholiday Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public boolean isIsLocalHoliday() {
        return isLocalHoliday;
    }

    /**
     * The Islocalholiday Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setIsLocalHoliday(boolean isLocalHoliday) {
        this.isLocalHoliday = isLocalHoliday;
    }

    /**
     * The Timeframes Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public List<Timeframe> getTimeframes() {
        return timeframes;
    }

    /**
     * The Timeframes Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setTimeframes(List<Timeframe> timeframes) {
        this.timeframes = timeframes;
    }

}
