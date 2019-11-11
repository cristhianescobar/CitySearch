
package com.cristhianescobar.codegen.ws.models.venueDetails;



/**
 * The Items Schema
 * <p>
 * 
 * 
 */
public class Item {

    /**
     * The Id Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "id")
    private String id = "";
    /**
     * The Createdat Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "createdAt")
    private long createdAt = 0L;
    /**
     * The Source Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "source")
    private Source source;
    /**
     * The Prefix Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "prefix")
    private String prefix = "";
    /**
     * The Suffix Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "suffix")
    private String suffix = "";
    /**
     * The Width Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "width")
    private long width = 0L;
    /**
     * The Height Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "height")
    private long height = 0L;
    /**
     * The User Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "user")
    private User user;
    /**
     * The Visibility Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "visibility")
    private String visibility = "";

    /**
     * The Id Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * The Id Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The Createdat Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public long getCreatedAt() {
        return createdAt;
    }

    /**
     * The Createdat Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The Source Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Source getSource() {
        return source;
    }

    /**
     * The Source Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setSource(Source source) {
        this.source = source;
    }

    /**
     * The Prefix Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * The Prefix Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * The Suffix Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * The Suffix Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * The Width Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public long getWidth() {
        return width;
    }

    /**
     * The Width Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setWidth(long width) {
        this.width = width;
    }

    /**
     * The Height Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public long getHeight() {
        return height;
    }

    /**
     * The Height Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setHeight(long height) {
        this.height = height;
    }

    /**
     * The User Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public User getUser() {
        return user;
    }

    /**
     * The User Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * The Visibility Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * The Visibility Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

}
