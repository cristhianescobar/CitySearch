
package com.cristhianescobar.codegen.ws.models;



/**
 * The Icon Schema
 * <p>
 * 
 * 
 */
public class Icon {

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

}
