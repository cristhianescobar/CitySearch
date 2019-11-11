
package com.cristhianescobar.codegen.ws.models.venueDetails;

import java.util.List;
import com.squareup.moshi.Json;


/**
 * The Attributes Schema
 * <p>
 * 
 * 
 */
public class Attributes {

    /**
     * The Groups Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @Json(name = "groups")
    private List<Group__6> groups = null;

    /**
     * The Groups Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public List<Group__6> getGroups() {
        return groups;
    }

    /**
     * The Groups Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setGroups(List<Group__6> groups) {
        this.groups = groups;
    }

}
