
package com.cristhianescobar.codegen.ws.models.typeahead;



/**
 * The Items Schema
 * <p>
 * 
 * 
 */
public class Category {

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
     * The Pluralname Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "pluralName")
    private String pluralName = "";
    /**
     * The Shortname Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "shortName")
    private String shortName = "";
    /**
     * The Icon Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @com.squareup.moshi.Json(name = "icon")
    private Icon icon;

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
     * The Pluralname Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getPluralName() {
        return pluralName;
    }

    /**
     * The Pluralname Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setPluralName(String pluralName) {
        this.pluralName = pluralName;
    }

    /**
     * The Shortname Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * The Shortname Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * The Icon Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Icon getIcon() {
        return icon;
    }

    /**
     * The Icon Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setIcon(Icon icon) {
        this.icon = icon;
    }

}
