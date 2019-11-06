
package com.cristhianescobar.codegen.ws.models.venue;



/**
 * The Root Schema
 * <p>
 * 
 * 
 */
public class VenuesResponse {

    /**
     * The Meta Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "meta")
    private Meta meta;
    /**
     * The Response Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "response")
    private Response response;

    /**
     * The Meta Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * The Meta Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * The Response Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Response getResponse() {
        return response;
    }

    /**
     * The Response Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setResponse(Response response) {
        this.response = response;
    }

}
