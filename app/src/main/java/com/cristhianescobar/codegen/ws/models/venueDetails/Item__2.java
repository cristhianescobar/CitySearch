
package com.cristhianescobar.codegen.ws.models.venueDetails;



/**
 * The Items Schema
 * <p>
 * 
 * 
 */
public class Item__2 {

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
     * The Text Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "text")
    private String text = "";
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
     * The Canonicalurl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "canonicalUrl")
    private String canonicalUrl = "";
    /**
     * The Photo Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "photo")
    private Photo__1 photo;
    /**
     * The Photourl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "photourl")
    private String photourl = "";
    /**
     * The Lang Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "lang")
    private String lang = "";
    /**
     * The Likes Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "likes")
    private Likes__1 likes;
    /**
     * The Logview Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "logView")
    private boolean logView = false;
    /**
     * The Agreecount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "agreeCount")
    private long agreeCount = 0L;
    /**
     * The Disagreecount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "disagreeCount")
    private long disagreeCount = 0L;
    /**
     * The Todo Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "todo")
    private Todo todo;
    /**
     * The User Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "user")
    private User__2 user;

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
     * The Text Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getText() {
        return text;
    }

    /**
     * The Text Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setText(String text) {
        this.text = text;
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
     * The Photo Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Photo__1 getPhoto() {
        return photo;
    }

    /**
     * The Photo Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setPhoto(Photo__1 photo) {
        this.photo = photo;
    }

    /**
     * The Photourl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getPhotourl() {
        return photourl;
    }

    /**
     * The Photourl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setPhotourl(String photourl) {
        this.photourl = photourl;
    }

    /**
     * The Lang Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getLang() {
        return lang;
    }

    /**
     * The Lang Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * The Likes Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Likes__1 getLikes() {
        return likes;
    }

    /**
     * The Likes Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setLikes(Likes__1 likes) {
        this.likes = likes;
    }

    /**
     * The Logview Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public boolean isLogView() {
        return logView;
    }

    /**
     * The Logview Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setLogView(boolean logView) {
        this.logView = logView;
    }

    /**
     * The Agreecount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public long getAgreeCount() {
        return agreeCount;
    }

    /**
     * The Agreecount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setAgreeCount(long agreeCount) {
        this.agreeCount = agreeCount;
    }

    /**
     * The Disagreecount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public long getDisagreeCount() {
        return disagreeCount;
    }

    /**
     * The Disagreecount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setDisagreeCount(long disagreeCount) {
        this.disagreeCount = disagreeCount;
    }

    /**
     * The Todo Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Todo getTodo() {
        return todo;
    }

    /**
     * The Todo Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setTodo(Todo todo) {
        this.todo = todo;
    }

    /**
     * The User Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public User__2 getUser() {
        return user;
    }

    /**
     * The User Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setUser(User__2 user) {
        this.user = user;
    }

}
