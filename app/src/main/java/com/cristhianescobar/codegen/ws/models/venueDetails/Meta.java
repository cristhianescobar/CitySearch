
package com.cristhianescobar.codegen.ws.models.venueDetails;



/**
 * The Meta Schema
 * <p>
 * 
 * 
 */
public class Meta {

    /**
     * The Code Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "code")
    private long code = 0L;
    /**
     * The Requestid Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "requestId")
    private String requestId = "";

    /**
     * The Code Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public long getCode() {
        return code;
    }

    /**
     * The Code Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setCode(long code) {
        this.code = code;
    }

    /**
     * The Requestid Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * The Requestid Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

}
