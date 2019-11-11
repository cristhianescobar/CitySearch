
package com.cristhianescobar.codegen.ws.models.venueDetails;

import java.util.List;
import com.squareup.moshi.Json;


/**
 * The Lists Schema
 * <p>
 * 
 * 
 */
public class Lists {

    /**
     * The Groups Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @Json(name = "groups")
    private List<Group__1> groups = null;

    /**
     * The Groups Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public List<Group__1> getGroups() {
        return groups;
    }

    /**
     * The Groups Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setGroups(List<Group__1> groups) {
        this.groups = groups;
    }

}
