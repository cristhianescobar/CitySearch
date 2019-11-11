
package com.cristhianescobar.codegen.ws.models.venueDetails;



/**
 * The Page Schema
 * <p>
 * 
 * 
 */
public class Page {

    /**
     * The Pageinfo Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "pageInfo")
    private PageInfo pageInfo;
    /**
     * The User Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "user")
    private User__1 user;

    /**
     * The Pageinfo Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    /**
     * The Pageinfo Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    /**
     * The User Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public User__1 getUser() {
        return user;
    }

    /**
     * The User Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setUser(User__1 user) {
        this.user = user;
    }

}
