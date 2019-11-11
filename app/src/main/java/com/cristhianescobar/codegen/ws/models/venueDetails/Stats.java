
package com.cristhianescobar.codegen.ws.models.venueDetails;



/**
 * The Stats Schema
 * <p>
 * 
 * 
 */
public class Stats {

    /**
     * The Checkinscount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "checkinsCount")
    private long checkinsCount = 0L;
    /**
     * The Userscount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "usersCount")
    private long usersCount = 0L;
    /**
     * The Tipcount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "tipCount")
    private long tipCount = 0L;
    /**
     * The Visitscount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "visitsCount")
    private long visitsCount = 0L;

    /**
     * The Checkinscount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public long getCheckinsCount() {
        return checkinsCount;
    }

    /**
     * The Checkinscount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setCheckinsCount(long checkinsCount) {
        this.checkinsCount = checkinsCount;
    }

    /**
     * The Userscount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public long getUsersCount() {
        return usersCount;
    }

    /**
     * The Userscount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setUsersCount(long usersCount) {
        this.usersCount = usersCount;
    }

    /**
     * The Tipcount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public long getTipCount() {
        return tipCount;
    }

    /**
     * The Tipcount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setTipCount(long tipCount) {
        this.tipCount = tipCount;
    }

    /**
     * The Visitscount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public long getVisitsCount() {
        return visitsCount;
    }

    /**
     * The Visitscount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setVisitsCount(long visitsCount) {
        this.visitsCount = visitsCount;
    }

}
