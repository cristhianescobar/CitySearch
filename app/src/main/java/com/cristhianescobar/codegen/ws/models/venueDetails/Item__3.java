
package com.cristhianescobar.codegen.ws.models.venueDetails;



/**
 * The Items Schema
 * <p>
 * 
 * 
 */
public class Item__3 {

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
     * The Name Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "name")
    private String name = "";
    /**
     * The Description Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "description")
    private String description = "";
    /**
     * The Type Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "type")
    private String type = "";
    /**
     * The User Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "user")
    private User__3 user;
    /**
     * The Editable Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "editable")
    private boolean editable = false;
    /**
     * The Public Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "public")
    private boolean _public = false;
    /**
     * The Collaborative Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "collaborative")
    private boolean collaborative = false;
    /**
     * The Url Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "url")
    private String url = "";
    /**
     * The Canonicalurl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "canonicalUrl")
    private String canonicalUrl = "";
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
     * The Updatedat Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "updatedAt")
    private long updatedAt = 0L;
    /**
     * The Photo Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "photo")
    private Photo__4 photo;
    /**
     * The Followers Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "followers")
    private Followers followers;
    /**
     * The Listitems Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "listItems")
    private ListItems listItems;

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
     * The Name Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * The Name Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The Description Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getDescription() {
        return description;
    }

    /**
     * The Description Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The Type Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getType() {
        return type;
    }

    /**
     * The Type Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The User Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public User__3 getUser() {
        return user;
    }

    /**
     * The User Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setUser(User__3 user) {
        this.user = user;
    }

    /**
     * The Editable Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public boolean isEditable() {
        return editable;
    }

    /**
     * The Editable Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    /**
     * The Public Schema
     * <p>
     * 
     * 
     */
    public boolean isPublic() {
        return _public;
    }

    /**
     * The Public Schema
     * <p>
     * 
     * 
     */
    public void setPublic(boolean _public) {
        this._public = _public;
    }

    /**
     * The Collaborative Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public boolean isCollaborative() {
        return collaborative;
    }

    /**
     * The Collaborative Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setCollaborative(boolean collaborative) {
        this.collaborative = collaborative;
    }

    /**
     * The Url Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getUrl() {
        return url;
    }

    /**
     * The Url Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * The Canonicalurl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getCanonicalUrl() {
        return canonicalUrl;
    }

    /**
     * The Canonicalurl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setCanonicalUrl(String canonicalUrl) {
        this.canonicalUrl = canonicalUrl;
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
     * The Updatedat Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public long getUpdatedAt() {
        return updatedAt;
    }

    /**
     * The Updatedat Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * The Photo Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Photo__4 getPhoto() {
        return photo;
    }

    /**
     * The Photo Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setPhoto(Photo__4 photo) {
        this.photo = photo;
    }

    /**
     * The Followers Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Followers getFollowers() {
        return followers;
    }

    /**
     * The Followers Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setFollowers(Followers followers) {
        this.followers = followers;
    }

    /**
     * The Listitems Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public ListItems getListItems() {
        return listItems;
    }

    /**
     * The Listitems Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setListItems(ListItems listItems) {
        this.listItems = listItems;
    }

}
