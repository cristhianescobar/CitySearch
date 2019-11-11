
package com.cristhianescobar.codegen.ws.models.venueDetails;



/**
 * The Items Schema
 * <p>
 * 
 * 
 */
public class Phrase {

    /**
     * The Phrase Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "phrase")
    private String phrase = "";
    /**
     * The Sample Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "sample")
    private Sample sample;
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
     * The Phrase Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getPhrase() {
        return phrase;
    }

    /**
     * The Phrase Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    /**
     * The Sample Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Sample getSample() {
        return sample;
    }

    /**
     * The Sample Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setSample(Sample sample) {
        this.sample = sample;
    }

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

}
