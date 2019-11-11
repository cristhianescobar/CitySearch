
package com.cristhianescobar.codegen.ws.models.venueDetails;



/**
 * The Beenhere Schema
 * <p>
 * 
 * 
 */
public class BeenHere {

    /**
     * The Count Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "count")
    private long count = 0L;
    /**
     * The Unconfirmedcount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "unconfirmedCount")
    private long unconfirmedCount = 0L;
    /**
     * The Marked Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "marked")
    private boolean marked = false;
    /**
     * The Lastcheckinexpiredat Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "lastCheckinExpiredAt")
    private long lastCheckinExpiredAt = 0L;

    /**
     * The Count Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public long getCount() {
        return count;
    }

    /**
     * The Count Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setCount(long count) {
        this.count = count;
    }

    /**
     * The Unconfirmedcount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public long getUnconfirmedCount() {
        return unconfirmedCount;
    }

    /**
     * The Unconfirmedcount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setUnconfirmedCount(long unconfirmedCount) {
        this.unconfirmedCount = unconfirmedCount;
    }

    /**
     * The Marked Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public boolean isMarked() {
        return marked;
    }

    /**
     * The Marked Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setMarked(boolean marked) {
        this.marked = marked;
    }

    /**
     * The Lastcheckinexpiredat Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public long getLastCheckinExpiredAt() {
        return lastCheckinExpiredAt;
    }

    /**
     * The Lastcheckinexpiredat Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setLastCheckinExpiredAt(long lastCheckinExpiredAt) {
        this.lastCheckinExpiredAt = lastCheckinExpiredAt;
    }

}
