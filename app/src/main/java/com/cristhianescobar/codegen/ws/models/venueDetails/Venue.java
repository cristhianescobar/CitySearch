
package com.cristhianescobar.codegen.ws.models.venueDetails;

import java.util.List;
import com.cristhianescobar.codegen.ws.models.typeahead.Category;


/**
 * The Venue Schema
 * <p>
 * 
 * 
 */
public class Venue {

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
     * The Contact Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "contact")
    private Contact contact;
    /**
     * The Location Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "location")
    private Location location;
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
     * The Categories Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "categories")
    private List<Category> categories = null;
    /**
     * The Verified Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "verified")
    private boolean verified = false;
    /**
     * The Stats Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "stats")
    private Stats stats;
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
     * The Likes Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "likes")
    private Likes likes;
    /**
     * The Rating Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "rating")
    private double rating = 0.0D;
    /**
     * The Ratingcolor Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "ratingColor")
    private String ratingColor = "";
    /**
     * The Ratingsignals Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "ratingSignals")
    private long ratingSignals = 0L;
    /**
     * The Beenhere Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "beenHere")
    private BeenHere beenHere;
    /**
     * The Photos Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "photos")
    private Photos photos;
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
     * The Storeid Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "storeId")
    private String storeId = "";
    /**
     * The Page Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "page")
    private Page page;
    /**
     * The Herenow Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "hereNow")
    private HereNow hereNow;
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
     * The Tips Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "tips")
    private Tips__1 tips;
    /**
     * The Shorturl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "shortUrl")
    private String shortUrl = "";
    /**
     * The Timezone Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "timeZone")
    private String timeZone = "";
    /**
     * The Listed Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "listed")
    private Listed listed;
    /**
     * The Phrases Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "phrases")
    private List<Phrase> phrases = null;
    /**
     * The Hours Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "hours")
    private Hours hours;
    /**
     * The Popular Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "popular")
    private Popular popular;
    /**
     * The Pageupdates Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "pageUpdates")
    private PageUpdates pageUpdates;
    /**
     * The Inbox Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "inbox")
    private Inbox inbox;
    /**
     * The Venuechains Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "venueChains")
    private List<Object> venueChains = null;
    /**
     * The Attributes Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "attributes")
    private Attributes attributes;
    /**
     * The Bestphoto Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "bestPhoto")
    private BestPhoto bestPhoto;

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
     * The Contact Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * The Contact Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /**
     * The Location Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Location getLocation() {
        return location;
    }

    /**
     * The Location Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setLocation(Location location) {
        this.location = location;
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
     * The Categories Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public List<Category> getCategories() {
        return categories;
    }

    /**
     * The Categories Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    /**
     * The Verified Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public boolean isVerified() {
        return verified;
    }

    /**
     * The Verified Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    /**
     * The Stats Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Stats getStats() {
        return stats;
    }

    /**
     * The Stats Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setStats(Stats stats) {
        this.stats = stats;
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
     * The Likes Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Likes getLikes() {
        return likes;
    }

    /**
     * The Likes Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setLikes(Likes likes) {
        this.likes = likes;
    }

    /**
     * The Rating Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public double getRating() {
        return rating;
    }

    /**
     * The Rating Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setRating(double rating) {
        this.rating = rating;
    }

    /**
     * The Ratingcolor Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getRatingColor() {
        return ratingColor;
    }

    /**
     * The Ratingcolor Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setRatingColor(String ratingColor) {
        this.ratingColor = ratingColor;
    }

    /**
     * The Ratingsignals Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public long getRatingSignals() {
        return ratingSignals;
    }

    /**
     * The Ratingsignals Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setRatingSignals(long ratingSignals) {
        this.ratingSignals = ratingSignals;
    }

    /**
     * The Beenhere Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public BeenHere getBeenHere() {
        return beenHere;
    }

    /**
     * The Beenhere Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setBeenHere(BeenHere beenHere) {
        this.beenHere = beenHere;
    }

    /**
     * The Photos Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Photos getPhotos() {
        return photos;
    }

    /**
     * The Photos Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setPhotos(Photos photos) {
        this.photos = photos;
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
     * The Storeid Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getStoreId() {
        return storeId;
    }

    /**
     * The Storeid Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    /**
     * The Page Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Page getPage() {
        return page;
    }

    /**
     * The Page Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * The Herenow Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public HereNow getHereNow() {
        return hereNow;
    }

    /**
     * The Herenow Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setHereNow(HereNow hereNow) {
        this.hereNow = hereNow;
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
     * The Tips Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Tips__1 getTips() {
        return tips;
    }

    /**
     * The Tips Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setTips(Tips__1 tips) {
        this.tips = tips;
    }

    /**
     * The Shorturl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getShortUrl() {
        return shortUrl;
    }

    /**
     * The Shorturl Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    /**
     * The Timezone Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * The Timezone Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * The Listed Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Listed getListed() {
        return listed;
    }

    /**
     * The Listed Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setListed(Listed listed) {
        this.listed = listed;
    }

    /**
     * The Phrases Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public List<Phrase> getPhrases() {
        return phrases;
    }

    /**
     * The Phrases Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setPhrases(List<Phrase> phrases) {
        this.phrases = phrases;
    }

    /**
     * The Hours Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Hours getHours() {
        return hours;
    }

    /**
     * The Hours Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setHours(Hours hours) {
        this.hours = hours;
    }

    /**
     * The Popular Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Popular getPopular() {
        return popular;
    }

    /**
     * The Popular Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setPopular(Popular popular) {
        this.popular = popular;
    }

    /**
     * The Pageupdates Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public PageUpdates getPageUpdates() {
        return pageUpdates;
    }

    /**
     * The Pageupdates Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setPageUpdates(PageUpdates pageUpdates) {
        this.pageUpdates = pageUpdates;
    }

    /**
     * The Inbox Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Inbox getInbox() {
        return inbox;
    }

    /**
     * The Inbox Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setInbox(Inbox inbox) {
        this.inbox = inbox;
    }

    /**
     * The Venuechains Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public List<Object> getVenueChains() {
        return venueChains;
    }

    /**
     * The Venuechains Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setVenueChains(List<Object> venueChains) {
        this.venueChains = venueChains;
    }

    /**
     * The Attributes Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Attributes getAttributes() {
        return attributes;
    }

    /**
     * The Attributes Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    /**
     * The Bestphoto Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public BestPhoto getBestPhoto() {
        return bestPhoto;
    }

    /**
     * The Bestphoto Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setBestPhoto(BestPhoto bestPhoto) {
        this.bestPhoto = bestPhoto;
    }

}
